/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.familybank.xyz.payment.notification.utils;

import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.apache.commons.text.StringSubstitutor;
import org.xml.sax.InputSource;

/**
 *
 * @author KEN16849
 */
public class Util {

    public static String getXPathValue(String message, String field, String xPathFieldNamePattern) throws XPathExpressionException {
        if (!message.isEmpty()) {
            HashMap<String, String> fieldsMap = new HashMap();
            fieldsMap.put("FIELD", field);
            String pattern = templateToMessage(fieldsMap, xPathFieldNamePattern);

            XPath xPath = XPathFactory.newInstance().newXPath();
            XPathExpression query = xPath.compile(pattern);

            try {
                return query.evaluate(new InputSource(new StringReader(message)));
            } catch (XPathExpressionException e) {
                //logger.error("Error: {}  message: {} xPathFieldNamePattern: {} ", e, message, xPathFieldNamePattern);
                e.getMessage();
                return "UNABLE_TO_PROCESS_XPATH";
            }
        } else {
            return "";
        }

    }

    public static String templateToMessage(Map<String, String> valuesMap, String templateString) {
        StringSubstitutor sub = new StringSubstitutor(valuesMap);
        String resolvedString = sub.replace(templateString);

        if (resolvedString.contains("${")) {
            //logger.info("some fields missing");
            resolvedString = resolvedString.replaceAll("\\$\\{.*?\\}", "").replaceAll(",?[A-Z\\.]*:=?\\$", "");
        }
        return resolvedString;
    }

    public static String getXPathValue(String message, String xPathFieldNamePattern) throws XPathExpressionException {
        XPath xPath = XPathFactory.newInstance().newXPath();
        XPathExpression query = xPath.compile(xPathFieldNamePattern);
        return query.evaluate(new InputSource(new StringReader(message)));
    }
}
