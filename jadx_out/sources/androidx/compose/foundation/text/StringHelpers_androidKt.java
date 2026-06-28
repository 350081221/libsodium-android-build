package androidx.compose.foundation.text;

import androidx.emoji2.text.EmojiCompat;
import java.text.BreakIterator;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\u0002\u001a\u0014\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¨\u0006\u0007"}, d2 = {"getEmojiCompatIfLoaded", "Landroidx/emoji2/text/EmojiCompat;", "findFollowingBreak", "", "", "index", "findPrecedingBreak", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nStringHelpers.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringHelpers.android.kt\nandroidx/compose/foundation/text/StringHelpers_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
/* loaded from: classes.dex */
public final class StringHelpers_androidKt {
    public static final int findFollowingBreak(@l String str, int i5) {
        boolean z4;
        EmojiCompat emojiCompatIfLoaded = getEmojiCompatIfLoaded();
        Integer num = null;
        if (emojiCompatIfLoaded != null) {
            Integer valueOf = Integer.valueOf(emojiCompatIfLoaded.getEmojiEnd(str, i5));
            if (valueOf.intValue() == -1) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i5);
    }

    public static final int findPrecedingBreak(@l String str, int i5) {
        EmojiCompat emojiCompatIfLoaded = getEmojiCompatIfLoaded();
        Integer num = null;
        if (emojiCompatIfLoaded != null) {
            boolean z4 = false;
            Integer valueOf = Integer.valueOf(emojiCompatIfLoaded.getEmojiStart(str, Math.max(0, i5 - 1)));
            if (valueOf.intValue() == -1) {
                z4 = true;
            }
            if (!z4) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i5);
    }

    private static final EmojiCompat getEmojiCompatIfLoaded() {
        if (!EmojiCompat.isConfigured()) {
            return null;
        }
        EmojiCompat emojiCompat = EmojiCompat.get();
        boolean z4 = true;
        if (emojiCompat.getLoadState() != 1) {
            z4 = false;
        }
        if (!z4) {
            return null;
        }
        return emojiCompat;
    }
}
