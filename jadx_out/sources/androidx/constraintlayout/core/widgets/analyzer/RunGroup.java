package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class RunGroup {
    public static final int BASELINE = 2;
    public static final int END = 1;
    public static final int START = 0;
    public static int index;
    int direction;
    WidgetRun firstRun;
    int groupIndex;
    WidgetRun lastRun;
    public int position = 0;
    public boolean dual = false;
    ArrayList<WidgetRun> runs = new ArrayList<>();

    public RunGroup(WidgetRun widgetRun, int i5) {
        this.firstRun = null;
        this.lastRun = null;
        int i6 = index;
        this.groupIndex = i6;
        index = i6 + 1;
        this.firstRun = widgetRun;
        this.lastRun = widgetRun;
        this.direction = i5;
    }

    private boolean defineTerminalWidget(WidgetRun widgetRun, int i5) {
        DependencyNode dependencyNode;
        WidgetRun widgetRun2;
        DependencyNode dependencyNode2;
        WidgetRun widgetRun3;
        if (!widgetRun.widget.isTerminalWidget[i5]) {
            return false;
        }
        for (Dependency dependency : widgetRun.start.dependencies) {
            if ((dependency instanceof DependencyNode) && (widgetRun3 = (dependencyNode2 = (DependencyNode) dependency).run) != widgetRun && dependencyNode2 == widgetRun3.start) {
                if (widgetRun instanceof ChainRun) {
                    Iterator<WidgetRun> it = ((ChainRun) widgetRun).widgets.iterator();
                    while (it.hasNext()) {
                        defineTerminalWidget(it.next(), i5);
                    }
                } else if (!(widgetRun instanceof HelperReferences)) {
                    widgetRun.widget.isTerminalWidget[i5] = false;
                }
                defineTerminalWidget(dependencyNode2.run, i5);
            }
        }
        for (Dependency dependency2 : widgetRun.end.dependencies) {
            if ((dependency2 instanceof DependencyNode) && (widgetRun2 = (dependencyNode = (DependencyNode) dependency2).run) != widgetRun && dependencyNode == widgetRun2.start) {
                if (widgetRun instanceof ChainRun) {
                    Iterator<WidgetRun> it2 = ((ChainRun) widgetRun).widgets.iterator();
                    while (it2.hasNext()) {
                        defineTerminalWidget(it2.next(), i5);
                    }
                } else if (!(widgetRun instanceof HelperReferences)) {
                    widgetRun.widget.isTerminalWidget[i5] = false;
                }
                defineTerminalWidget(dependencyNode.run, i5);
            }
        }
        return false;
    }

    private long traverseEnd(DependencyNode dependencyNode, long j5) {
        WidgetRun widgetRun = dependencyNode.run;
        if (widgetRun instanceof HelperReferences) {
            return j5;
        }
        int size = dependencyNode.dependencies.size();
        long j6 = j5;
        for (int i5 = 0; i5 < size; i5++) {
            Dependency dependency = dependencyNode.dependencies.get(i5);
            if (dependency instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency;
                if (dependencyNode2.run != widgetRun) {
                    j6 = Math.min(j6, traverseEnd(dependencyNode2, dependencyNode2.margin + j5));
                }
            }
        }
        if (dependencyNode == widgetRun.end) {
            long wrapDimension = j5 - widgetRun.getWrapDimension();
            return Math.min(Math.min(j6, traverseEnd(widgetRun.start, wrapDimension)), wrapDimension - widgetRun.start.margin);
        }
        return j6;
    }

    private long traverseStart(DependencyNode dependencyNode, long j5) {
        WidgetRun widgetRun = dependencyNode.run;
        if (widgetRun instanceof HelperReferences) {
            return j5;
        }
        int size = dependencyNode.dependencies.size();
        long j6 = j5;
        for (int i5 = 0; i5 < size; i5++) {
            Dependency dependency = dependencyNode.dependencies.get(i5);
            if (dependency instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency;
                if (dependencyNode2.run != widgetRun) {
                    j6 = Math.max(j6, traverseStart(dependencyNode2, dependencyNode2.margin + j5));
                }
            }
        }
        if (dependencyNode == widgetRun.start) {
            long wrapDimension = j5 + widgetRun.getWrapDimension();
            return Math.max(Math.max(j6, traverseStart(widgetRun.end, wrapDimension)), wrapDimension - widgetRun.end.margin);
        }
        return j6;
    }

    public void add(WidgetRun widgetRun) {
        this.runs.add(widgetRun);
        this.lastRun = widgetRun;
    }

    public long computeWrapSize(ConstraintWidgetContainer constraintWidgetContainer, int i5) {
        WidgetRun widgetRun;
        WidgetRun widgetRun2;
        long wrapDimension;
        int i6;
        WidgetRun widgetRun3 = this.firstRun;
        long j5 = 0;
        if (widgetRun3 instanceof ChainRun) {
            if (((ChainRun) widgetRun3).orientation != i5) {
                return 0L;
            }
        } else if (i5 == 0) {
            if (!(widgetRun3 instanceof HorizontalWidgetRun)) {
                return 0L;
            }
        } else if (!(widgetRun3 instanceof VerticalWidgetRun)) {
            return 0L;
        }
        if (i5 == 0) {
            widgetRun = constraintWidgetContainer.horizontalRun;
        } else {
            widgetRun = constraintWidgetContainer.verticalRun;
        }
        DependencyNode dependencyNode = widgetRun.start;
        if (i5 == 0) {
            widgetRun2 = constraintWidgetContainer.horizontalRun;
        } else {
            widgetRun2 = constraintWidgetContainer.verticalRun;
        }
        DependencyNode dependencyNode2 = widgetRun2.end;
        boolean contains = widgetRun3.start.targets.contains(dependencyNode);
        boolean contains2 = this.firstRun.end.targets.contains(dependencyNode2);
        long wrapDimension2 = this.firstRun.getWrapDimension();
        if (contains && contains2) {
            long traverseStart = traverseStart(this.firstRun.start, 0L);
            long traverseEnd = traverseEnd(this.firstRun.end, 0L);
            long j6 = traverseStart - wrapDimension2;
            WidgetRun widgetRun4 = this.firstRun;
            int i7 = widgetRun4.end.margin;
            if (j6 >= (-i7)) {
                j6 += i7;
            }
            int i8 = widgetRun4.start.margin;
            long j7 = ((-traverseEnd) - wrapDimension2) - i8;
            if (j7 >= i8) {
                j7 -= i8;
            }
            float biasPercent = widgetRun4.widget.getBiasPercent(i5);
            if (biasPercent > 0.0f) {
                j5 = (((float) j7) / biasPercent) + (((float) j6) / (1.0f - biasPercent));
            }
            float f5 = (float) j5;
            long j8 = (f5 * biasPercent) + 0.5f + wrapDimension2 + (f5 * (1.0f - biasPercent)) + 0.5f;
            wrapDimension = r12.start.margin + j8;
            i6 = this.firstRun.end.margin;
        } else {
            if (contains) {
                return Math.max(traverseStart(this.firstRun.start, r12.margin), this.firstRun.start.margin + wrapDimension2);
            }
            if (contains2) {
                return Math.max(-traverseEnd(this.firstRun.end, r12.margin), (-this.firstRun.end.margin) + wrapDimension2);
            }
            wrapDimension = r12.start.margin + this.firstRun.getWrapDimension();
            i6 = this.firstRun.end.margin;
        }
        return wrapDimension - i6;
    }

    public void defineTerminalWidgets(boolean z4, boolean z5) {
        if (z4) {
            WidgetRun widgetRun = this.firstRun;
            if (widgetRun instanceof HorizontalWidgetRun) {
                defineTerminalWidget(widgetRun, 0);
            }
        }
        if (z5) {
            WidgetRun widgetRun2 = this.firstRun;
            if (widgetRun2 instanceof VerticalWidgetRun) {
                defineTerminalWidget(widgetRun2, 1);
            }
        }
    }
}
