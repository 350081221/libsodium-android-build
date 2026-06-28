package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLString;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;
import t0.b;

@i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ6\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002J\u0016\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\bJ\u000e\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0001J\"\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013j\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u00142\u0006\u0010\u0003\u001a\u00020\u0002J&\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0013j\b\u0012\u0004\u0012\u00020\u0002`\u0014R0\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0017j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004`\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR0\u0010\u001c\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001b0\u0017j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001b`\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aRP\u0010\u001d\u001a>\u0012\u0004\u0012\u00020\u0002\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00020\u0013j\b\u0012\u0004\u0012\u00020\u0002`\u00140\u0017j\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00020\u0013j\b\u0012\u0004\u0012\u00020\u0002`\u0014`\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001a¨\u0006 "}, d2 = {"Landroidx/constraintlayout/compose/LayoutVariables;", "", "", "elementName", "", "element", "Lkotlin/r2;", "put", "", "start", "incrementBy", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "step", "prefix", "postfix", b.f22420d, "putOverride", "get", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getList", "elements", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "margins", "Ljava/util/HashMap;", "Landroidx/constraintlayout/compose/GeneratedValue;", "generators", "arrayIds", "<init>", "()V", "compose_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class LayoutVariables {

    @l
    private final HashMap<String, Integer> margins = new HashMap<>();

    @l
    private final HashMap<String, GeneratedValue> generators = new HashMap<>();

    @l
    private final HashMap<String, ArrayList<String>> arrayIds = new HashMap<>();

    public final float get(@l Object elementName) {
        l0.p(elementName, "elementName");
        if (elementName instanceof CLString) {
            String content = ((CLString) elementName).content();
            if (this.generators.containsKey(content)) {
                GeneratedValue generatedValue = this.generators.get(content);
                l0.m(generatedValue);
                return generatedValue.value();
            }
            if (this.margins.containsKey(content)) {
                l0.m(this.margins.get(content));
                return r2.intValue();
            }
            return 0.0f;
        }
        if (elementName instanceof CLNumber) {
            return ((CLNumber) elementName).getFloat();
        }
        return 0.0f;
    }

    @m
    public final ArrayList<String> getList(@l String elementName) {
        l0.p(elementName, "elementName");
        if (this.arrayIds.containsKey(elementName)) {
            return this.arrayIds.get(elementName);
        }
        return null;
    }

    public final void put(@l String elementName, int i5) {
        l0.p(elementName, "elementName");
        this.margins.put(elementName, Integer.valueOf(i5));
    }

    public final void putOverride(@l String elementName, float f5) {
        l0.p(elementName, "elementName");
        this.generators.put(elementName, new OverrideValue(f5));
    }

    public final void put(@l String elementName, float f5, float f6) {
        l0.p(elementName, "elementName");
        if (this.generators.containsKey(elementName) && (this.generators.get(elementName) instanceof OverrideValue)) {
            return;
        }
        this.generators.put(elementName, new Generator(f5, f6));
    }

    public final void put(@l String elementName, float f5, float f6, float f7, @l String prefix, @l String postfix) {
        l0.p(elementName, "elementName");
        l0.p(prefix, "prefix");
        l0.p(postfix, "postfix");
        if (this.generators.containsKey(elementName) && (this.generators.get(elementName) instanceof OverrideValue)) {
            return;
        }
        FiniteGenerator finiteGenerator = new FiniteGenerator(f5, f6, f7, prefix, postfix);
        this.generators.put(elementName, finiteGenerator);
        this.arrayIds.put(elementName, finiteGenerator.array());
    }

    public final void put(@l String elementName, @l ArrayList<String> elements) {
        l0.p(elementName, "elementName");
        l0.p(elements, "elements");
        this.arrayIds.put(elementName, elements);
    }
}
