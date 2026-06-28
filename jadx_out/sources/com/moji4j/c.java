package com.moji4j;

import java.lang.Character;

/* loaded from: classes3.dex */
public class c {
    public boolean a(String str) {
        for (char c5 : str.toCharArray()) {
            if (d(c5)) {
                return true;
            }
        }
        return false;
    }

    public boolean b(String str) {
        for (char c5 : str.toCharArray()) {
            if (e(c5)) {
                return true;
            }
        }
        return false;
    }

    public boolean c(String str) {
        for (char c5 : str.toCharArray()) {
            if (f(c5)) {
                return true;
            }
        }
        return false;
    }

    public boolean d(char c5) {
        Character.UnicodeBlock of = Character.UnicodeBlock.of(c5);
        if (of != Character.UnicodeBlock.HIRAGANA && of != Character.UnicodeBlock.KATAKANA && of != Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS) {
            return false;
        }
        return true;
    }

    public boolean e(char c5) {
        return Character.UnicodeBlock.of(c5) == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS;
    }

    public boolean f(char c5) {
        return (c5 >= 'A' && c5 <= 'Z') || (c5 >= 'a' && c5 <= 'z');
    }
}
