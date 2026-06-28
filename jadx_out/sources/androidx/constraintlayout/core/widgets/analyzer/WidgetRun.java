package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* loaded from: classes2.dex */
public abstract class WidgetRun implements Dependency {
    protected ConstraintWidget.DimensionBehaviour dimensionBehavior;
    public int matchConstraintsType;
    RunGroup runGroup;
    ConstraintWidget widget;
    DimensionDependency dimension = new DimensionDependency(this);
    public int orientation = 0;
    boolean resolved = false;
    public DependencyNode start = new DependencyNode(this);
    public DependencyNode end = new DependencyNode(this);
    protected RunType mRunType = RunType.NONE;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.core.widgets.analyzer.WidgetRun$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type = iArr;
            try {
                iArr[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes2.dex */
    enum RunType {
        NONE,
        START,
        END,
        CENTER
    }

    public WidgetRun(ConstraintWidget constraintWidget) {
        this.widget = constraintWidget;
    }

    private void resolveDimension(int i5, int i6) {
        WidgetRun widgetRun;
        float f5;
        int i7;
        int i8 = this.matchConstraintsType;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 == 3) {
                        ConstraintWidget constraintWidget = this.widget;
                        WidgetRun widgetRun2 = constraintWidget.horizontalRun;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour = widgetRun2.dimensionBehavior;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                        if (dimensionBehaviour == dimensionBehaviour2 && widgetRun2.matchConstraintsType == 3) {
                            VerticalWidgetRun verticalWidgetRun = constraintWidget.verticalRun;
                            if (verticalWidgetRun.dimensionBehavior == dimensionBehaviour2 && verticalWidgetRun.matchConstraintsType == 3) {
                                return;
                            }
                        }
                        if (i5 == 0) {
                            widgetRun2 = constraintWidget.verticalRun;
                        }
                        if (widgetRun2.dimension.resolved) {
                            float dimensionRatio = constraintWidget.getDimensionRatio();
                            if (i5 == 1) {
                                i7 = (int) ((widgetRun2.dimension.value / dimensionRatio) + 0.5f);
                            } else {
                                i7 = (int) ((dimensionRatio * widgetRun2.dimension.value) + 0.5f);
                            }
                            this.dimension.resolve(i7);
                            return;
                        }
                        return;
                    }
                    return;
                }
                ConstraintWidget parent = this.widget.getParent();
                if (parent != null) {
                    if (i5 == 0) {
                        widgetRun = parent.horizontalRun;
                    } else {
                        widgetRun = parent.verticalRun;
                    }
                    if (widgetRun.dimension.resolved) {
                        ConstraintWidget constraintWidget2 = this.widget;
                        if (i5 == 0) {
                            f5 = constraintWidget2.mMatchConstraintPercentWidth;
                        } else {
                            f5 = constraintWidget2.mMatchConstraintPercentHeight;
                        }
                        this.dimension.resolve(getLimitedDimension((int) ((r9.value * f5) + 0.5f), i5));
                        return;
                    }
                    return;
                }
                return;
            }
            this.dimension.resolve(Math.min(getLimitedDimension(this.dimension.wrapValue, i5), i6));
            return;
        }
        this.dimension.resolve(getLimitedDimension(i6, i5));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void addTarget(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i5) {
        dependencyNode.targets.add(dependencyNode2);
        dependencyNode.margin = i5;
        dependencyNode2.dependencies.add(dependencyNode);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void apply();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void applyToWidget();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void clear();

    /* JADX INFO: Access modifiers changed from: protected */
    public final int getLimitedDimension(int i5, int i6) {
        int max;
        if (i6 == 0) {
            ConstraintWidget constraintWidget = this.widget;
            int i7 = constraintWidget.mMatchConstraintMaxWidth;
            max = Math.max(constraintWidget.mMatchConstraintMinWidth, i5);
            if (i7 > 0) {
                max = Math.min(i7, i5);
            }
            if (max == i5) {
                return i5;
            }
        } else {
            ConstraintWidget constraintWidget2 = this.widget;
            int i8 = constraintWidget2.mMatchConstraintMaxHeight;
            max = Math.max(constraintWidget2.mMatchConstraintMinHeight, i5);
            if (i8 > 0) {
                max = Math.min(i8, i5);
            }
            if (max == i5) {
                return i5;
            }
        }
        return max;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final DependencyNode getTarget(ConstraintAnchor constraintAnchor) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.mOwner;
        int i5 = AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[constraintAnchor2.mType.ordinal()];
        if (i5 == 1) {
            return constraintWidget.horizontalRun.start;
        }
        if (i5 == 2) {
            return constraintWidget.horizontalRun.end;
        }
        if (i5 == 3) {
            return constraintWidget.verticalRun.start;
        }
        if (i5 == 4) {
            return constraintWidget.verticalRun.baseline;
        }
        if (i5 != 5) {
            return null;
        }
        return constraintWidget.verticalRun.end;
    }

    public long getWrapDimension() {
        if (this.dimension.resolved) {
            return r0.value;
        }
        return 0L;
    }

    public boolean isCenterConnection() {
        int size = this.start.targets.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            if (this.start.targets.get(i6).run != this) {
                i5++;
            }
        }
        int size2 = this.end.targets.size();
        for (int i7 = 0; i7 < size2; i7++) {
            if (this.end.targets.get(i7).run != this) {
                i5++;
            }
        }
        if (i5 < 2) {
            return false;
        }
        return true;
    }

    public boolean isDimensionResolved() {
        return this.dimension.resolved;
    }

    public boolean isResolved() {
        return this.resolved;
    }

    abstract void reset();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean supportsWrapComputation();

    @Override // androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(Dependency dependency) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void updateRunCenter(Dependency dependency, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i5) {
        float verticalBiasPercent;
        DependencyNode target = getTarget(constraintAnchor);
        DependencyNode target2 = getTarget(constraintAnchor2);
        if (target.resolved && target2.resolved) {
            int margin = target.value + constraintAnchor.getMargin();
            int margin2 = target2.value - constraintAnchor2.getMargin();
            int i6 = margin2 - margin;
            if (!this.dimension.resolved && this.dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                resolveDimension(i5, i6);
            }
            DimensionDependency dimensionDependency = this.dimension;
            if (!dimensionDependency.resolved) {
                return;
            }
            if (dimensionDependency.value == i6) {
                this.start.resolve(margin);
                this.end.resolve(margin2);
                return;
            }
            ConstraintWidget constraintWidget = this.widget;
            if (i5 == 0) {
                verticalBiasPercent = constraintWidget.getHorizontalBiasPercent();
            } else {
                verticalBiasPercent = constraintWidget.getVerticalBiasPercent();
            }
            if (target == target2) {
                margin = target.value;
                margin2 = target2.value;
                verticalBiasPercent = 0.5f;
            }
            this.start.resolve((int) (margin + 0.5f + (((margin2 - margin) - this.dimension.value) * verticalBiasPercent)));
            this.end.resolve(this.start.value + this.dimension.value);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void updateRunEnd(Dependency dependency) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void updateRunStart(Dependency dependency) {
    }

    public long wrapSize(int i5) {
        int i6;
        DimensionDependency dimensionDependency = this.dimension;
        if (dimensionDependency.resolved) {
            long j5 = dimensionDependency.value;
            if (isCenterConnection()) {
                i6 = this.start.margin - this.end.margin;
            } else if (i5 == 0) {
                i6 = this.start.margin;
            } else {
                return j5 - this.end.margin;
            }
            return j5 + i6;
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void addTarget(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i5, DimensionDependency dimensionDependency) {
        dependencyNode.targets.add(dependencyNode2);
        dependencyNode.targets.add(this.dimension);
        dependencyNode.marginFactor = i5;
        dependencyNode.marginDependency = dimensionDependency;
        dependencyNode2.dependencies.add(dependencyNode);
        dimensionDependency.dependencies.add(dependencyNode);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final DependencyNode getTarget(ConstraintAnchor constraintAnchor, int i5) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.mOwner;
        WidgetRun widgetRun = i5 == 0 ? constraintWidget.horizontalRun : constraintWidget.verticalRun;
        int i6 = AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[constraintAnchor2.mType.ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 != 5) {
                        return null;
                    }
                }
            }
            return widgetRun.end;
        }
        return widgetRun.start;
    }
}
