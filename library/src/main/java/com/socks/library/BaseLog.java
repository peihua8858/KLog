/*
 * Copyright (C) Globalegrow E-Commerce Co. , Ltd. 2007-2018.
 * All rights reserved.
 * This software is the confidential and proprietary information
 * of Globalegrow E-Commerce Co. , Ltd. ("Confidential Information").
 * You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement
 * you entered into with Globalegrow.
 */

package com.socks.library;

import android.util.Log;

/**
 * Created by zhaokaiqiang on 15/11/18.
 */
public class BaseLog {

    private static final int MAX_LENGTH = 4000;

    public static void printDefault(int type, String tag, String msg) {

        int index = 0;
        int length = msg.length();
        int countOfSub = length / MAX_LENGTH;

        if (countOfSub > 0) {
            for (int i = 0; i < countOfSub; i++) {
                String sub = msg.substring(index, index + MAX_LENGTH);
                printSub(type, tag, sub);
                index += MAX_LENGTH;
            }
            printSub(type, tag, msg.substring(index, length));
        } else {
            printSub(type, tag, msg);
        }
    }

    private static void printSub(int type, String tag, String sub) {
        switch (type) {
            case KLog.V:
                Log.v(tag, sub);
                break;
            case KLog.D:
                Log.d(tag, sub);
                break;
            case KLog.I:
                Log.i(tag, sub);
                break;
            case KLog.W:
                Log.w(tag, sub);
                break;
            case KLog.E:
                Log.e(tag, sub);
                break;
            case KLog.A:
                Log.wtf(tag, sub);
                break;
            default:
                break;
        }
    }

}