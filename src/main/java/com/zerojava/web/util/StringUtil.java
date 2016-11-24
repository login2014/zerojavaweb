package com.zerojava.web.util;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by Administrator on 2016/11/22.
 */
public class StringUtil {
    public static boolean isNotEmpty(String strValue) {
        return !isEmpty(strValue);
    }

    private static boolean isEmpty(String strValue) {
        if (strValue != null) {
            strValue = strValue.trim();
        }
        return StringUtils.isEmpty(strValue);
    }
}
