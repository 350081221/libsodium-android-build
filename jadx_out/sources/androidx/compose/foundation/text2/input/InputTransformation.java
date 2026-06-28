package androidx.compose.foundation.text2.input;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Stable;
import kotlin.i0;
import p4.l;
import p4.m;
import v3.p;

@Stable
@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bç\u0080\u0001\u0018\u0000 \f2\u00020\u0001:\u0001\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text2/input/InputTransformation;", "", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "originalValue", "Landroidx/compose/foundation/text2/input/TextFieldBuffer;", "valueWithChanges", "Lkotlin/r2;", "transformInput", "Landroidx/compose/foundation/text/KeyboardOptions;", "getKeyboardOptions", "()Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public interface InputTransformation {

    @l
    public static final Companion Companion = Companion.$$INSTANCE;

    @i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ@\u0010\n\u001a\u00020\t26\u0010\b\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/text2/input/InputTransformation$Companion;", "", "Lkotlin/Function2;", "", "Lkotlin/v0;", "name", "current", "proposed", "transformation", "Landroidx/compose/foundation/text2/input/InputTransformation;", "byValue", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Stable
        @l
        @ExperimentalFoundationApi
        public final InputTransformation byValue(@l p<? super CharSequence, ? super CharSequence, ? extends CharSequence> pVar) {
            return new InputTransformationByValue(pVar);
        }
    }

    @m
    default KeyboardOptions getKeyboardOptions() {
        return null;
    }

    void transformInput(@l TextFieldCharSequence textFieldCharSequence, @l TextFieldBuffer textFieldBuffer);
}
