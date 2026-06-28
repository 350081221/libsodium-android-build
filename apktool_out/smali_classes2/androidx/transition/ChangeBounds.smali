.class public Landroidx/transition/ChangeBounds;
.super Landroidx/transition/Transition;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/transition/ChangeBounds$ViewBounds;,
        Landroidx/transition/ChangeBounds$ClipListener;,
        Landroidx/transition/ChangeBounds$SuppressLayoutListener;
    }
.end annotation


# static fields
.field private static final BOTTOM_RIGHT_ONLY_PROPERTY:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroid/view/View;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field private static final BOTTOM_RIGHT_PROPERTY:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroidx/transition/ChangeBounds$ViewBounds;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field private static final POSITION_PROPERTY:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroid/view/View;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field private static final PROPNAME_BOUNDS:Ljava/lang/String; = "android:changeBounds:bounds"

.field private static final PROPNAME_CLIP:Ljava/lang/String; = "android:changeBounds:clip"

.field private static final PROPNAME_PARENT:Ljava/lang/String; = "android:changeBounds:parent"

.field private static final PROPNAME_WINDOW_X:Ljava/lang/String; = "android:changeBounds:windowX"

.field private static final PROPNAME_WINDOW_Y:Ljava/lang/String; = "android:changeBounds:windowY"

.field private static final TOP_LEFT_ONLY_PROPERTY:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroid/view/View;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field private static final TOP_LEFT_PROPERTY:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroidx/transition/ChangeBounds$ViewBounds;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field private static final sRectEvaluator:Landroidx/transition/RectEvaluator;

.field private static final sTransitionProperties:[Ljava/lang/String;


# instance fields
.field private mResizeClip:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const-string v0, "android:changeBounds:windowX"

    .line 2
    .line 3
    const-string v1, "android:changeBounds:windowY"

    .line 4
    .line 5
    const-string v2, "android:changeBounds:bounds"

    .line 6
    .line 7
    const-string v3, "android:changeBounds:clip"

    .line 8
    .line 9
    const-string v4, "android:changeBounds:parent"

    .line 10
    .line 11
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Landroidx/transition/ChangeBounds;->sTransitionProperties:[Ljava/lang/String;

    .line 16
    .line 17
    new-instance v0, Landroidx/transition/ChangeBounds$1;

    .line 18
    .line 19
    const-class v1, Landroid/graphics/PointF;

    .line 20
    .line 21
    const-string/jumbo v2, "topLeft"

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, v1, v2}, Landroidx/transition/ChangeBounds$1;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Landroidx/transition/ChangeBounds;->TOP_LEFT_PROPERTY:Landroid/util/Property;

    .line 28
    .line 29
    new-instance v0, Landroidx/transition/ChangeBounds$2;

    .line 30
    .line 31
    const-string v3, "bottomRight"

    .line 32
    .line 33
    invoke-direct {v0, v1, v3}, Landroidx/transition/ChangeBounds$2;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    sput-object v0, Landroidx/transition/ChangeBounds;->BOTTOM_RIGHT_PROPERTY:Landroid/util/Property;

    .line 37
    .line 38
    new-instance v0, Landroidx/transition/ChangeBounds$3;

    .line 39
    .line 40
    invoke-direct {v0, v1, v3}, Landroidx/transition/ChangeBounds$3;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    sput-object v0, Landroidx/transition/ChangeBounds;->BOTTOM_RIGHT_ONLY_PROPERTY:Landroid/util/Property;

    .line 44
    .line 45
    new-instance v0, Landroidx/transition/ChangeBounds$4;

    .line 46
    .line 47
    invoke-direct {v0, v1, v2}, Landroidx/transition/ChangeBounds$4;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    sput-object v0, Landroidx/transition/ChangeBounds;->TOP_LEFT_ONLY_PROPERTY:Landroid/util/Property;

    .line 51
    .line 52
    new-instance v0, Landroidx/transition/ChangeBounds$5;

    .line 53
    .line 54
    const-string v2, "position"

    .line 55
    .line 56
    invoke-direct {v0, v1, v2}, Landroidx/transition/ChangeBounds$5;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Landroidx/transition/ChangeBounds;->POSITION_PROPERTY:Landroid/util/Property;

    .line 60
    .line 61
    new-instance v0, Landroidx/transition/RectEvaluator;

    .line 62
    .line 63
    invoke-direct {v0}, Landroidx/transition/RectEvaluator;-><init>()V

    .line 64
    .line 65
    .line 66
    sput-object v0, Landroidx/transition/ChangeBounds;->sRectEvaluator:Landroidx/transition/RectEvaluator;

    .line 67
    .line 68
    return-void
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/transition/Transition;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroidx/transition/ChangeBounds;->mResizeClip:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 3
    invoke-direct {p0, p1, p2}, Landroidx/transition/Transition;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Landroidx/transition/ChangeBounds;->mResizeClip:Z

    .line 5
    sget-object v1, Landroidx/transition/Styleable;->CHANGE_BOUNDS:[I

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 6
    check-cast p2, Landroid/content/res/XmlResourceParser;

    const-string v1, "resizeClip"

    invoke-static {p1, p2, v1, v0, v0}, Landroidx/core/content/res/TypedArrayUtils;->getNamedBoolean(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IZ)Z

    move-result p2

    .line 7
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 8
    invoke-virtual {p0, p2}, Landroidx/transition/ChangeBounds;->setResizeClip(Z)V

    return-void
.end method

.method private captureValues(Landroidx/transition/TransitionValues;)V
    .locals 7

    .line 1
    iget-object v0, p1, Landroidx/transition/TransitionValues;->view:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->isLaidOut()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    :cond_0
    iget-object v1, p1, Landroidx/transition/TransitionValues;->values:Ljava/util/Map;

    .line 22
    .line 23
    new-instance v2, Landroid/graphics/Rect;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    invoke-direct {v2, v3, v4, v5, v6}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 42
    .line 43
    .line 44
    const-string v3, "android:changeBounds:bounds"

    .line 45
    .line 46
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    iget-object v1, p1, Landroidx/transition/TransitionValues;->values:Ljava/util/Map;

    .line 50
    .line 51
    iget-object v2, p1, Landroidx/transition/TransitionValues;->view:Landroid/view/View;

    .line 52
    .line 53
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    const-string v3, "android:changeBounds:parent"

    .line 58
    .line 59
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    iget-boolean v1, p0, Landroidx/transition/ChangeBounds;->mResizeClip:Z

    .line 63
    .line 64
    if-eqz v1, :cond_1

    .line 65
    .line 66
    iget-object p1, p1, Landroidx/transition/TransitionValues;->values:Ljava/util/Map;

    .line 67
    .line 68
    const-string v1, "android:changeBounds:clip"

    .line 69
    .line 70
    invoke-virtual {v0}, Landroid/view/View;->getClipBounds()Landroid/graphics/Rect;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    :cond_1
    return-void
    .line 78
.end method


# virtual methods
.method public captureEndValues(Landroidx/transition/TransitionValues;)V
    .locals 0
    .param p1    # Landroidx/transition/TransitionValues;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0, p1}, Landroidx/transition/ChangeBounds;->captureValues(Landroidx/transition/TransitionValues;)V

    return-void
.end method

.method public captureStartValues(Landroidx/transition/TransitionValues;)V
    .locals 2
    .param p1    # Landroidx/transition/TransitionValues;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, Landroidx/transition/ChangeBounds;->captureValues(Landroidx/transition/TransitionValues;)V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Landroidx/transition/ChangeBounds;->mResizeClip:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p1, Landroidx/transition/TransitionValues;->view:Landroid/view/View;

    .line 9
    .line 10
    sget v1, Landroidx/transition/R$id;->transition_clip:I

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Landroid/graphics/Rect;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object p1, p1, Landroidx/transition/TransitionValues;->values:Ljava/util/Map;

    .line 21
    .line 22
    const-string v1, "android:changeBounds:clip"

    .line 23
    .line 24
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public createAnimator(Landroid/view/ViewGroup;Landroidx/transition/TransitionValues;Landroidx/transition/TransitionValues;)Landroid/animation/Animator;
    .locals 22
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/transition/TransitionValues;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Landroidx/transition/TransitionValues;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    if-eqz v1, :cond_1b

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    goto/16 :goto_e

    .line 12
    .line 13
    :cond_0
    iget-object v4, v1, Landroidx/transition/TransitionValues;->values:Ljava/util/Map;

    .line 14
    .line 15
    iget-object v5, v2, Landroidx/transition/TransitionValues;->values:Ljava/util/Map;

    .line 16
    .line 17
    const-string v6, "android:changeBounds:parent"

    .line 18
    .line 19
    invoke-interface {v4, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    check-cast v4, Landroid/view/ViewGroup;

    .line 24
    .line 25
    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    check-cast v5, Landroid/view/ViewGroup;

    .line 30
    .line 31
    if-eqz v4, :cond_1a

    .line 32
    .line 33
    if-nez v5, :cond_1

    .line 34
    .line 35
    goto/16 :goto_d

    .line 36
    .line 37
    :cond_1
    iget-object v4, v2, Landroidx/transition/TransitionValues;->view:Landroid/view/View;

    .line 38
    .line 39
    iget-object v5, v1, Landroidx/transition/TransitionValues;->values:Ljava/util/Map;

    .line 40
    .line 41
    const-string v6, "android:changeBounds:bounds"

    .line 42
    .line 43
    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    check-cast v5, Landroid/graphics/Rect;

    .line 48
    .line 49
    iget-object v7, v2, Landroidx/transition/TransitionValues;->values:Ljava/util/Map;

    .line 50
    .line 51
    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    check-cast v6, Landroid/graphics/Rect;

    .line 56
    .line 57
    iget v12, v5, Landroid/graphics/Rect;->left:I

    .line 58
    .line 59
    iget v15, v6, Landroid/graphics/Rect;->left:I

    .line 60
    .line 61
    iget v13, v5, Landroid/graphics/Rect;->top:I

    .line 62
    .line 63
    iget v14, v6, Landroid/graphics/Rect;->top:I

    .line 64
    .line 65
    iget v11, v5, Landroid/graphics/Rect;->right:I

    .line 66
    .line 67
    iget v10, v6, Landroid/graphics/Rect;->right:I

    .line 68
    .line 69
    iget v5, v5, Landroid/graphics/Rect;->bottom:I

    .line 70
    .line 71
    iget v9, v6, Landroid/graphics/Rect;->bottom:I

    .line 72
    .line 73
    sub-int v6, v11, v12

    .line 74
    .line 75
    sub-int v7, v5, v13

    .line 76
    .line 77
    sub-int v8, v10, v15

    .line 78
    .line 79
    sub-int v3, v9, v14

    .line 80
    .line 81
    iget-object v1, v1, Landroidx/transition/TransitionValues;->values:Ljava/util/Map;

    .line 82
    .line 83
    move-object/from16 v20, v4

    .line 84
    .line 85
    const-string v4, "android:changeBounds:clip"

    .line 86
    .line 87
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    check-cast v1, Landroid/graphics/Rect;

    .line 92
    .line 93
    iget-object v2, v2, Landroidx/transition/TransitionValues;->values:Ljava/util/Map;

    .line 94
    .line 95
    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    check-cast v2, Landroid/graphics/Rect;

    .line 100
    .line 101
    if-eqz v6, :cond_2

    .line 102
    .line 103
    if-nez v7, :cond_3

    .line 104
    .line 105
    :cond_2
    if-eqz v8, :cond_7

    .line 106
    .line 107
    if-eqz v3, :cond_7

    .line 108
    .line 109
    :cond_3
    if-ne v12, v15, :cond_5

    .line 110
    .line 111
    if-eq v13, v14, :cond_4

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_4
    const/16 v16, 0x0

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_5
    :goto_0
    const/16 v16, 0x1

    .line 118
    .line 119
    :goto_1
    if-ne v11, v10, :cond_6

    .line 120
    .line 121
    if-eq v5, v9, :cond_8

    .line 122
    .line 123
    :cond_6
    add-int/lit8 v16, v16, 0x1

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_7
    const/16 v16, 0x0

    .line 127
    .line 128
    :cond_8
    :goto_2
    if-eqz v1, :cond_9

    .line 129
    .line 130
    invoke-virtual {v1, v2}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v17

    .line 134
    if-eqz v17, :cond_a

    .line 135
    .line 136
    :cond_9
    if-nez v1, :cond_b

    .line 137
    .line 138
    if-eqz v2, :cond_b

    .line 139
    .line 140
    :cond_a
    add-int/lit8 v16, v16, 0x1

    .line 141
    .line 142
    :cond_b
    move/from16 v4, v16

    .line 143
    .line 144
    if-lez v4, :cond_19

    .line 145
    .line 146
    move-object/from16 v16, v2

    .line 147
    .line 148
    iget-boolean v2, v0, Landroidx/transition/ChangeBounds;->mResizeClip:Z

    .line 149
    .line 150
    move-object/from16 v17, v1

    .line 151
    .line 152
    const/4 v1, 0x2

    .line 153
    if-nez v2, :cond_10

    .line 154
    .line 155
    move-object/from16 v2, v20

    .line 156
    .line 157
    invoke-static {v2, v12, v13, v11, v5}, Landroidx/transition/ViewUtils;->setLeftTopRightBottom(Landroid/view/View;IIII)V

    .line 158
    .line 159
    .line 160
    if-ne v4, v1, :cond_d

    .line 161
    .line 162
    if-ne v6, v8, :cond_c

    .line 163
    .line 164
    if-ne v7, v3, :cond_c

    .line 165
    .line 166
    invoke-virtual/range {p0 .. p0}, Landroidx/transition/Transition;->getPathMotion()Landroidx/transition/PathMotion;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    int-to-float v3, v12

    .line 171
    int-to-float v4, v13

    .line 172
    int-to-float v5, v15

    .line 173
    int-to-float v6, v14

    .line 174
    invoke-virtual {v1, v3, v4, v5, v6}, Landroidx/transition/PathMotion;->getPath(FFFF)Landroid/graphics/Path;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    sget-object v3, Landroidx/transition/ChangeBounds;->POSITION_PROPERTY:Landroid/util/Property;

    .line 179
    .line 180
    invoke-static {v2, v3, v1}, Landroidx/transition/ObjectAnimatorUtils;->ofPointF(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    goto :goto_4

    .line 185
    :cond_c
    new-instance v3, Landroidx/transition/ChangeBounds$ViewBounds;

    .line 186
    .line 187
    invoke-direct {v3, v2}, Landroidx/transition/ChangeBounds$ViewBounds;-><init>(Landroid/view/View;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {p0 .. p0}, Landroidx/transition/Transition;->getPathMotion()Landroidx/transition/PathMotion;

    .line 191
    .line 192
    .line 193
    move-result-object v4

    .line 194
    int-to-float v6, v12

    .line 195
    int-to-float v7, v13

    .line 196
    int-to-float v8, v15

    .line 197
    int-to-float v12, v14

    .line 198
    invoke-virtual {v4, v6, v7, v8, v12}, Landroidx/transition/PathMotion;->getPath(FFFF)Landroid/graphics/Path;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    sget-object v6, Landroidx/transition/ChangeBounds;->TOP_LEFT_PROPERTY:Landroid/util/Property;

    .line 203
    .line 204
    invoke-static {v3, v6, v4}, Landroidx/transition/ObjectAnimatorUtils;->ofPointF(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    .line 205
    .line 206
    .line 207
    move-result-object v4

    .line 208
    invoke-virtual/range {p0 .. p0}, Landroidx/transition/Transition;->getPathMotion()Landroidx/transition/PathMotion;

    .line 209
    .line 210
    .line 211
    move-result-object v6

    .line 212
    int-to-float v7, v11

    .line 213
    int-to-float v5, v5

    .line 214
    int-to-float v8, v10

    .line 215
    int-to-float v9, v9

    .line 216
    invoke-virtual {v6, v7, v5, v8, v9}, Landroidx/transition/PathMotion;->getPath(FFFF)Landroid/graphics/Path;

    .line 217
    .line 218
    .line 219
    move-result-object v5

    .line 220
    sget-object v6, Landroidx/transition/ChangeBounds;->BOTTOM_RIGHT_PROPERTY:Landroid/util/Property;

    .line 221
    .line 222
    invoke-static {v3, v6, v5}, Landroidx/transition/ObjectAnimatorUtils;->ofPointF(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    .line 223
    .line 224
    .line 225
    move-result-object v5

    .line 226
    new-instance v6, Landroid/animation/AnimatorSet;

    .line 227
    .line 228
    invoke-direct {v6}, Landroid/animation/AnimatorSet;-><init>()V

    .line 229
    .line 230
    .line 231
    new-array v1, v1, [Landroid/animation/Animator;

    .line 232
    .line 233
    const/4 v7, 0x0

    .line 234
    aput-object v4, v1, v7

    .line 235
    .line 236
    const/4 v4, 0x1

    .line 237
    aput-object v5, v1, v4

    .line 238
    .line 239
    invoke-virtual {v6, v1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 240
    .line 241
    .line 242
    new-instance v1, Landroidx/transition/ChangeBounds$6;

    .line 243
    .line 244
    invoke-direct {v1, v0, v3}, Landroidx/transition/ChangeBounds$6;-><init>(Landroidx/transition/ChangeBounds;Landroidx/transition/ChangeBounds$ViewBounds;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v6, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 248
    .line 249
    .line 250
    move-object/from16 p3, v2

    .line 251
    .line 252
    move-object v1, v6

    .line 253
    goto/16 :goto_c

    .line 254
    .line 255
    :cond_d
    if-ne v12, v15, :cond_f

    .line 256
    .line 257
    if-eq v13, v14, :cond_e

    .line 258
    .line 259
    goto :goto_3

    .line 260
    :cond_e
    invoke-virtual/range {p0 .. p0}, Landroidx/transition/Transition;->getPathMotion()Landroidx/transition/PathMotion;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    int-to-float v3, v11

    .line 265
    int-to-float v4, v5

    .line 266
    int-to-float v5, v10

    .line 267
    int-to-float v6, v9

    .line 268
    invoke-virtual {v1, v3, v4, v5, v6}, Landroidx/transition/PathMotion;->getPath(FFFF)Landroid/graphics/Path;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    sget-object v3, Landroidx/transition/ChangeBounds;->BOTTOM_RIGHT_ONLY_PROPERTY:Landroid/util/Property;

    .line 273
    .line 274
    invoke-static {v2, v3, v1}, Landroidx/transition/ObjectAnimatorUtils;->ofPointF(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    goto :goto_4

    .line 279
    :cond_f
    :goto_3
    invoke-virtual/range {p0 .. p0}, Landroidx/transition/Transition;->getPathMotion()Landroidx/transition/PathMotion;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    int-to-float v3, v12

    .line 284
    int-to-float v4, v13

    .line 285
    int-to-float v5, v15

    .line 286
    int-to-float v6, v14

    .line 287
    invoke-virtual {v1, v3, v4, v5, v6}, Landroidx/transition/PathMotion;->getPath(FFFF)Landroid/graphics/Path;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    sget-object v3, Landroidx/transition/ChangeBounds;->TOP_LEFT_ONLY_PROPERTY:Landroid/util/Property;

    .line 292
    .line 293
    invoke-static {v2, v3, v1}, Landroidx/transition/ObjectAnimatorUtils;->ofPointF(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    :goto_4
    move-object/from16 p3, v2

    .line 298
    .line 299
    goto/16 :goto_c

    .line 300
    .line 301
    :cond_10
    move-object/from16 v2, v20

    .line 302
    .line 303
    invoke-static {v6, v8}, Ljava/lang/Math;->max(II)I

    .line 304
    .line 305
    .line 306
    move-result v4

    .line 307
    invoke-static {v7, v3}, Ljava/lang/Math;->max(II)I

    .line 308
    .line 309
    .line 310
    move-result v18

    .line 311
    add-int/2addr v4, v12

    .line 312
    add-int v1, v13, v18

    .line 313
    .line 314
    invoke-static {v2, v12, v13, v4, v1}, Landroidx/transition/ViewUtils;->setLeftTopRightBottom(Landroid/view/View;IIII)V

    .line 315
    .line 316
    .line 317
    if-ne v12, v15, :cond_12

    .line 318
    .line 319
    if-eq v13, v14, :cond_11

    .line 320
    .line 321
    goto :goto_5

    .line 322
    :cond_11
    move/from16 v18, v9

    .line 323
    .line 324
    move/from16 v20, v10

    .line 325
    .line 326
    move/from16 v21, v11

    .line 327
    .line 328
    const/4 v1, 0x0

    .line 329
    goto :goto_6

    .line 330
    :cond_12
    :goto_5
    invoke-virtual/range {p0 .. p0}, Landroidx/transition/Transition;->getPathMotion()Landroidx/transition/PathMotion;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    int-to-float v4, v12

    .line 335
    move/from16 v18, v9

    .line 336
    .line 337
    int-to-float v9, v13

    .line 338
    move/from16 v20, v10

    .line 339
    .line 340
    int-to-float v10, v15

    .line 341
    move/from16 v21, v11

    .line 342
    .line 343
    int-to-float v11, v14

    .line 344
    invoke-virtual {v1, v4, v9, v10, v11}, Landroidx/transition/PathMotion;->getPath(FFFF)Landroid/graphics/Path;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    sget-object v4, Landroidx/transition/ChangeBounds;->POSITION_PROPERTY:Landroid/util/Property;

    .line 349
    .line 350
    invoke-static {v2, v4, v1}, Landroidx/transition/ObjectAnimatorUtils;->ofPointF(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    .line 351
    .line 352
    .line 353
    move-result-object v1

    .line 354
    :goto_6
    if-nez v17, :cond_13

    .line 355
    .line 356
    const/4 v9, 0x1

    .line 357
    goto :goto_7

    .line 358
    :cond_13
    const/4 v9, 0x0

    .line 359
    :goto_7
    if-eqz v9, :cond_14

    .line 360
    .line 361
    new-instance v4, Landroid/graphics/Rect;

    .line 362
    .line 363
    const/4 v10, 0x0

    .line 364
    invoke-direct {v4, v10, v10, v6, v7}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 365
    .line 366
    .line 367
    goto :goto_8

    .line 368
    :cond_14
    const/4 v10, 0x0

    .line 369
    move-object/from16 v4, v17

    .line 370
    .line 371
    :goto_8
    if-nez v16, :cond_15

    .line 372
    .line 373
    const/4 v11, 0x1

    .line 374
    goto :goto_9

    .line 375
    :cond_15
    move v11, v10

    .line 376
    :goto_9
    if-eqz v11, :cond_16

    .line 377
    .line 378
    new-instance v6, Landroid/graphics/Rect;

    .line 379
    .line 380
    invoke-direct {v6, v10, v10, v8, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 381
    .line 382
    .line 383
    move-object v3, v6

    .line 384
    goto :goto_a

    .line 385
    :cond_16
    move-object/from16 v3, v16

    .line 386
    .line 387
    :goto_a
    invoke-virtual {v4, v3}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    .line 388
    .line 389
    .line 390
    move-result v6

    .line 391
    if-nez v6, :cond_17

    .line 392
    .line 393
    invoke-virtual {v2, v4}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    .line 394
    .line 395
    .line 396
    sget-object v6, Landroidx/transition/ChangeBounds;->sRectEvaluator:Landroidx/transition/RectEvaluator;

    .line 397
    .line 398
    const/4 v7, 0x2

    .line 399
    new-array v7, v7, [Ljava/lang/Object;

    .line 400
    .line 401
    aput-object v4, v7, v10

    .line 402
    .line 403
    const/4 v8, 0x1

    .line 404
    aput-object v3, v7, v8

    .line 405
    .line 406
    const-string v8, "clipBounds"

    .line 407
    .line 408
    invoke-static {v2, v8, v6, v7}, Landroid/animation/ObjectAnimator;->ofObject(Ljava/lang/Object;Ljava/lang/String;Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/ObjectAnimator;

    .line 409
    .line 410
    .line 411
    move-result-object v10

    .line 412
    new-instance v8, Landroidx/transition/ChangeBounds$ClipListener;

    .line 413
    .line 414
    move-object v6, v8

    .line 415
    move-object v7, v2

    .line 416
    move-object/from16 p3, v2

    .line 417
    .line 418
    move-object v2, v8

    .line 419
    move-object v8, v4

    .line 420
    move/from16 v4, v18

    .line 421
    .line 422
    move/from16 v18, v20

    .line 423
    .line 424
    move-object/from16 v20, v1

    .line 425
    .line 426
    move-object v1, v10

    .line 427
    move-object v10, v3

    .line 428
    move/from16 v3, v21

    .line 429
    .line 430
    move/from16 v17, v14

    .line 431
    .line 432
    move v14, v3

    .line 433
    move v3, v15

    .line 434
    move v15, v5

    .line 435
    move/from16 v16, v3

    .line 436
    .line 437
    move/from16 v19, v4

    .line 438
    .line 439
    invoke-direct/range {v6 .. v19}, Landroidx/transition/ChangeBounds$ClipListener;-><init>(Landroid/view/View;Landroid/graphics/Rect;ZLandroid/graphics/Rect;ZIIIIIIII)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v1, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v0, v2}, Landroidx/transition/Transition;->addListener(Landroidx/transition/Transition$TransitionListener;)Landroidx/transition/Transition;

    .line 446
    .line 447
    .line 448
    move-object v3, v1

    .line 449
    move-object/from16 v1, v20

    .line 450
    .line 451
    goto :goto_b

    .line 452
    :cond_17
    move-object/from16 p3, v2

    .line 453
    .line 454
    const/4 v3, 0x0

    .line 455
    :goto_b
    invoke-static {v1, v3}, Landroidx/transition/TransitionUtils;->mergeAnimators(Landroid/animation/Animator;Landroid/animation/Animator;)Landroid/animation/Animator;

    .line 456
    .line 457
    .line 458
    move-result-object v1

    .line 459
    :goto_c
    invoke-virtual/range {p3 .. p3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 460
    .line 461
    .line 462
    move-result-object v2

    .line 463
    instance-of v2, v2, Landroid/view/ViewGroup;

    .line 464
    .line 465
    if-eqz v2, :cond_18

    .line 466
    .line 467
    invoke-virtual/range {p3 .. p3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 468
    .line 469
    .line 470
    move-result-object v2

    .line 471
    check-cast v2, Landroid/view/ViewGroup;

    .line 472
    .line 473
    const/4 v3, 0x1

    .line 474
    invoke-static {v2, v3}, Landroidx/transition/ViewGroupUtils;->suppressLayout(Landroid/view/ViewGroup;Z)V

    .line 475
    .line 476
    .line 477
    invoke-virtual/range {p0 .. p0}, Landroidx/transition/Transition;->getRootTransition()Landroidx/transition/Transition;

    .line 478
    .line 479
    .line 480
    move-result-object v3

    .line 481
    new-instance v4, Landroidx/transition/ChangeBounds$SuppressLayoutListener;

    .line 482
    .line 483
    invoke-direct {v4, v2}, Landroidx/transition/ChangeBounds$SuppressLayoutListener;-><init>(Landroid/view/ViewGroup;)V

    .line 484
    .line 485
    .line 486
    invoke-virtual {v3, v4}, Landroidx/transition/Transition;->addListener(Landroidx/transition/Transition$TransitionListener;)Landroidx/transition/Transition;

    .line 487
    .line 488
    .line 489
    :cond_18
    return-object v1

    .line 490
    :cond_19
    const/4 v1, 0x0

    .line 491
    return-object v1

    .line 492
    :cond_1a
    :goto_d
    const/4 v1, 0x0

    .line 493
    return-object v1

    .line 494
    :cond_1b
    :goto_e
    const/4 v1, 0x0

    .line 495
    return-object v1
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
.end method

.method public getResizeClip()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/transition/ChangeBounds;->mResizeClip:Z

    return v0
.end method

.method public getTransitionProperties()[Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    sget-object v0, Landroidx/transition/ChangeBounds;->sTransitionProperties:[Ljava/lang/String;

    return-object v0
.end method

.method public isSeekingSupported()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public setResizeClip(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/transition/ChangeBounds;->mResizeClip:Z

    return-void
.end method
