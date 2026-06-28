.class public final Landroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$4;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/constraintlayout/compose/ConstraintLayoutKt;->ConstraintLayout(Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/compose/ui/Modifier;IZLandroidx/compose/animation/core/AnimationSpec;Lv3/a;Lv3/p;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/o;",
        "Lv3/p<",
        "Lkotlinx/coroutines/s0;",
        "Lkotlin/coroutines/d<",
        "-",
        "Lkotlin/r2;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$4"
    f = "ConstraintLayout.kt"
    i = {}
    l = {
        0xe7,
        0xf0
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation runtime Lkotlin/i0;
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $animationSpec:Landroidx/compose/animation/core/AnimationSpec;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/AnimationSpec<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $channel:Lkotlinx/coroutines/channels/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/channels/l<",
            "Landroidx/constraintlayout/compose/ConstraintSet;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $direction:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $endConstraint$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/constraintlayout/compose/ConstraintSet;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $finishedAnimationListener:Lv3/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $progress:Landroidx/compose/animation/core/Animatable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/Animatable<",
            "Ljava/lang/Float;",
            "Landroidx/compose/animation/core/AnimationVector1D;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $startConstraint$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/constraintlayout/compose/ConstraintSet;",
            ">;"
        }
    .end annotation
.end field

.field L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/channels/l;Landroidx/compose/runtime/MutableState;Landroidx/compose/animation/core/Animatable;Landroidx/compose/animation/core/AnimationSpec;Lv3/a;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/channels/l<",
            "Landroidx/constraintlayout/compose/ConstraintSet;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Integer;",
            ">;",
            "Landroidx/compose/animation/core/Animatable<",
            "Ljava/lang/Float;",
            "Landroidx/compose/animation/core/AnimationVector1D;",
            ">;",
            "Landroidx/compose/animation/core/AnimationSpec<",
            "Ljava/lang/Float;",
            ">;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/constraintlayout/compose/ConstraintSet;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/constraintlayout/compose/ConstraintSet;",
            ">;",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$4;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$4;->$channel:Lkotlinx/coroutines/channels/l;

    iput-object p2, p0, Landroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$4;->$direction:Landroidx/compose/runtime/MutableState;

    iput-object p3, p0, Landroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$4;->$progress:Landroidx/compose/animation/core/Animatable;

    iput-object p4, p0, Landroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$4;->$animationSpec:Landroidx/compose/animation/core/AnimationSpec;

    iput-object p5, p0, Landroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$4;->$finishedAnimationListener:Lv3/a;

    iput-object p6, p0, Landroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$4;->$startConstraint$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p7, p0, Landroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$4;->$endConstraint$delegate:Landroidx/compose/runtime/MutableState;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Lkotlin/coroutines/jvm/internal/o;-><init>(ILkotlin/coroutines/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;
    .locals 9
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/d<",
            "*>;)",
            "Lkotlin/coroutines/d<",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    new-instance p1, Landroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$4;

    iget-object v1, p0, Landroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$4;->$channel:Lkotlinx/coroutines/channels/l;

    iget-object v2, p0, Landroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$4;->$direction:Landroidx/compose/runtime/MutableState;

    iget-object v3, p0, Landroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$4;->$progress:Landroidx/compose/animation/core/Animatable;

    iget-object v4, p0, Landroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$4;->$animationSpec:Landroidx/compose/animation/core/AnimationSpec;

    iget-object v5, p0, Landroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$4;->$finishedAnimationListener:Lv3/a;

    iget-object v6, p0, Landroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$4;->$startConstraint$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v7, p0, Landroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$4;->$endConstraint$delegate:Landroidx/compose/runtime/MutableState;

    move-object v0, p1

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Landroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$4;-><init>(Lkotlinx/coroutines/channels/l;Landroidx/compose/runtime/MutableState;Landroidx/compose/animation/core/Animatable;Landroidx/compose/animation/core/AnimationSpec;Lv3/a;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/d;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/s0;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Landroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$4;->invoke(Lkotlinx/coroutines/s0;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/s0;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lkotlinx/coroutines/s0;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/d;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/s0;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-virtual {p0, p1, p2}, Landroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$4;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Landroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$4;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Landroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Landroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$4;->label:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v3, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Landroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$4;->L$0:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Lkotlinx/coroutines/channels/n;

    .line 18
    .line 19
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    move-object p1, v1

    .line 23
    move-object v1, p0

    .line 24
    goto/16 :goto_5

    .line 25
    .line 26
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 27
    .line 28
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 29
    .line 30
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p1

    .line 34
    :cond_1
    iget-object v1, p0, Landroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$4;->L$0:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, Lkotlinx/coroutines/channels/n;

    .line 37
    .line 38
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    move-object v12, p0

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, Landroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$4;->$channel:Lkotlinx/coroutines/channels/l;

    .line 47
    .line 48
    invoke-interface {p1}, Lkotlinx/coroutines/channels/g0;->iterator()Lkotlinx/coroutines/channels/n;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    move-object v1, p0

    .line 53
    :goto_0
    iput-object p1, v1, Landroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$4;->L$0:Ljava/lang/Object;

    .line 54
    .line 55
    iput v3, v1, Landroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$4;->label:I

    .line 56
    .line 57
    invoke-interface {p1, v1}, Lkotlinx/coroutines/channels/n;->c(Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    if-ne v4, v0, :cond_3

    .line 62
    .line 63
    return-object v0

    .line 64
    :cond_3
    move-object v12, v1

    .line 65
    move-object v1, p1

    .line 66
    move-object p1, v4

    .line 67
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-eqz p1, :cond_b

    .line 74
    .line 75
    invoke-interface {v1}, Lkotlinx/coroutines/channels/n;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    check-cast p1, Landroidx/constraintlayout/compose/ConstraintSet;

    .line 80
    .line 81
    iget-object v4, v12, Landroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$4;->$channel:Lkotlinx/coroutines/channels/l;

    .line 82
    .line 83
    invoke-interface {v4}, Lkotlinx/coroutines/channels/g0;->v()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    invoke-static {v4}, Lkotlinx/coroutines/channels/p;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    check-cast v4, Landroidx/constraintlayout/compose/ConstraintSet;

    .line 92
    .line 93
    if-nez v4, :cond_4

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_4
    move-object p1, v4

    .line 97
    :goto_2
    iget-object v4, v12, Landroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$4;->$direction:Landroidx/compose/runtime/MutableState;

    .line 98
    .line 99
    invoke-interface {v4}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    check-cast v4, Ljava/lang/Number;

    .line 104
    .line 105
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    if-ne v4, v3, :cond_5

    .line 110
    .line 111
    iget-object v4, v12, Landroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$4;->$startConstraint$delegate:Landroidx/compose/runtime/MutableState;

    .line 112
    .line 113
    invoke-static {v4}, Landroidx/constraintlayout/compose/ConstraintLayoutKt;->access$ConstraintLayout$lambda-6(Landroidx/compose/runtime/MutableState;)Landroidx/constraintlayout/compose/ConstraintSet;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    goto :goto_3

    .line 118
    :cond_5
    iget-object v4, v12, Landroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$4;->$endConstraint$delegate:Landroidx/compose/runtime/MutableState;

    .line 119
    .line 120
    invoke-static {v4}, Landroidx/constraintlayout/compose/ConstraintLayoutKt;->access$ConstraintLayout$lambda-9(Landroidx/compose/runtime/MutableState;)Landroidx/constraintlayout/compose/ConstraintSet;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    :goto_3
    invoke-static {p1, v4}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    if-nez v4, :cond_a

    .line 129
    .line 130
    iget-object v4, v12, Landroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$4;->$direction:Landroidx/compose/runtime/MutableState;

    .line 131
    .line 132
    invoke-interface {v4}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    check-cast v4, Ljava/lang/Number;

    .line 137
    .line 138
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    if-ne v4, v3, :cond_6

    .line 143
    .line 144
    iget-object v4, v12, Landroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$4;->$endConstraint$delegate:Landroidx/compose/runtime/MutableState;

    .line 145
    .line 146
    invoke-static {v4, p1}, Landroidx/constraintlayout/compose/ConstraintLayoutKt;->access$ConstraintLayout$lambda-10(Landroidx/compose/runtime/MutableState;Landroidx/constraintlayout/compose/ConstraintSet;)V

    .line 147
    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_6
    iget-object v4, v12, Landroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$4;->$startConstraint$delegate:Landroidx/compose/runtime/MutableState;

    .line 151
    .line 152
    invoke-static {v4, p1}, Landroidx/constraintlayout/compose/ConstraintLayoutKt;->access$ConstraintLayout$lambda-7(Landroidx/compose/runtime/MutableState;Landroidx/constraintlayout/compose/ConstraintSet;)V

    .line 153
    .line 154
    .line 155
    :goto_4
    iget-object v4, v12, Landroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$4;->$progress:Landroidx/compose/animation/core/Animatable;

    .line 156
    .line 157
    iget-object p1, v12, Landroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$4;->$direction:Landroidx/compose/runtime/MutableState;

    .line 158
    .line 159
    invoke-interface {p1}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    check-cast p1, Ljava/lang/Number;

    .line 164
    .line 165
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 166
    .line 167
    .line 168
    move-result p1

    .line 169
    int-to-float p1, p1

    .line 170
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->e(F)Ljava/lang/Float;

    .line 171
    .line 172
    .line 173
    move-result-object v5

    .line 174
    iget-object v6, v12, Landroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$4;->$animationSpec:Landroidx/compose/animation/core/AnimationSpec;

    .line 175
    .line 176
    const/4 v7, 0x0

    .line 177
    const/4 v8, 0x0

    .line 178
    const/16 v10, 0xc

    .line 179
    .line 180
    const/4 v11, 0x0

    .line 181
    iput-object v1, v12, Landroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$4;->L$0:Ljava/lang/Object;

    .line 182
    .line 183
    iput v2, v12, Landroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$4;->label:I

    .line 184
    .line 185
    move-object v9, v12

    .line 186
    invoke-static/range {v4 .. v11}, Landroidx/compose/animation/core/Animatable;->animateTo$default(Landroidx/compose/animation/core/Animatable;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Lv3/l;Lkotlin/coroutines/d;ILjava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    if-ne p1, v0, :cond_7

    .line 191
    .line 192
    return-object v0

    .line 193
    :cond_7
    move-object p1, v1

    .line 194
    move-object v1, v12

    .line 195
    :goto_5
    iget-object v4, v1, Landroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$4;->$direction:Landroidx/compose/runtime/MutableState;

    .line 196
    .line 197
    invoke-interface {v4}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    check-cast v5, Ljava/lang/Number;

    .line 202
    .line 203
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 204
    .line 205
    .line 206
    move-result v5

    .line 207
    if-ne v5, v3, :cond_8

    .line 208
    .line 209
    const/4 v5, 0x0

    .line 210
    goto :goto_6

    .line 211
    :cond_8
    move v5, v3

    .line 212
    :goto_6
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/b;->f(I)Ljava/lang/Integer;

    .line 213
    .line 214
    .line 215
    move-result-object v5

    .line 216
    invoke-interface {v4, v5}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    iget-object v4, v1, Landroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$4;->$finishedAnimationListener:Lv3/a;

    .line 220
    .line 221
    if-nez v4, :cond_9

    .line 222
    .line 223
    goto/16 :goto_0

    .line 224
    .line 225
    :cond_9
    invoke-interface {v4}, Lv3/a;->invoke()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    goto/16 :goto_0

    .line 229
    .line 230
    :cond_a
    move-object p1, v1

    .line 231
    move-object v1, v12

    .line 232
    goto/16 :goto_0

    .line 233
    .line 234
    :cond_b
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 235
    .line 236
    return-object p1
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
.end method
