.class public final Lorg/burnoutcrew/reorderable/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/burnoutcrew/reorderable/b;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\nR#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\u000c8\u0002X\u0082\u0004\u00f8\u0001\u0001\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR/\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00028V@RX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0012\u0010\u0016R\u001d\u0010\u0005\u001a\u00020\u00048VX\u0096\u0004\u00f8\u0001\u0001\u00f8\u0001\u0000\u00f8\u0001\u0002\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u0017\u0082\u0002\u000f\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\n\u0002\u0008!\u00a8\u0006\u001a"
    }
    d2 = {
        "Lorg/burnoutcrew/reorderable/m;",
        "Lorg/burnoutcrew/reorderable/b;",
        "Lorg/burnoutcrew/reorderable/d;",
        "position",
        "Landroidx/compose/ui/geometry/Offset;",
        "offset",
        "Lkotlin/r2;",
        "a",
        "(Lorg/burnoutcrew/reorderable/d;JLkotlin/coroutines/d;)Ljava/lang/Object;",
        "",
        "F",
        "stiffness",
        "Landroidx/compose/animation/core/Animatable;",
        "Landroidx/compose/animation/core/AnimationVector2D;",
        "b",
        "Landroidx/compose/animation/core/Animatable;",
        "animatable",
        "<set-?>",
        "c",
        "Landroidx/compose/runtime/MutableState;",
        "getPosition",
        "()Lorg/burnoutcrew/reorderable/d;",
        "(Lorg/burnoutcrew/reorderable/d;)V",
        "()J",
        "<init>",
        "(F)V",
        "reorderable"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# static fields
.field public static final d:I


# instance fields
.field private final a:F

.field private final b:Landroidx/compose/animation/core/Animatable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/Animatable<",
            "Landroidx/compose/ui/geometry/Offset;",
            "Landroidx/compose/animation/core/AnimationVector2D;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final c:Landroidx/compose/runtime/MutableState;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Landroidx/compose/animation/core/Animatable;->$stable:I

    sput v0, Lorg/burnoutcrew/reorderable/m;->d:I

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Lorg/burnoutcrew/reorderable/m;-><init>(FILkotlin/jvm/internal/w;)V

    return-void
.end method

.method public constructor <init>(F)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lorg/burnoutcrew/reorderable/m;->a:F

    .line 2
    new-instance p1, Landroidx/compose/animation/core/Animatable;

    sget-object v0, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    move-result-wide v1

    invoke-static {v1, v2}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    move-result-object v1

    invoke-static {v0}, Landroidx/compose/animation/core/VectorConvertersKt;->getVectorConverter(Landroidx/compose/ui/geometry/Offset$Companion;)Landroidx/compose/animation/core/TwoWayConverter;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Landroidx/compose/animation/core/Animatable;-><init>(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;ILkotlin/jvm/internal/w;)V

    iput-object p1, p0, Lorg/burnoutcrew/reorderable/m;->b:Landroidx/compose/animation/core/Animatable;

    const/4 p1, 0x0

    const/4 v0, 0x2

    .line 3
    invoke-static {p1, p1, v0, p1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object p1

    iput-object p1, p0, Lorg/burnoutcrew/reorderable/m;->c:Landroidx/compose/runtime/MutableState;

    return-void
.end method

.method public synthetic constructor <init>(FILkotlin/jvm/internal/w;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/high16 p1, 0x43c80000    # 400.0f

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lorg/burnoutcrew/reorderable/m;-><init>(F)V

    return-void
.end method

.method private c(Lorg/burnoutcrew/reorderable/d;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/burnoutcrew/reorderable/m;->c:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
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
.end method


# virtual methods
.method public a(Lorg/burnoutcrew/reorderable/d;JLkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 10
    .param p1    # Lorg/burnoutcrew/reorderable/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/burnoutcrew/reorderable/d;",
            "J",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    .line 1
    instance-of v0, p4, Lorg/burnoutcrew/reorderable/m$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lorg/burnoutcrew/reorderable/m$a;

    .line 7
    .line 8
    iget v1, v0, Lorg/burnoutcrew/reorderable/m$a;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lorg/burnoutcrew/reorderable/m$a;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lorg/burnoutcrew/reorderable/m$a;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Lorg/burnoutcrew/reorderable/m$a;-><init>(Lorg/burnoutcrew/reorderable/m;Lkotlin/coroutines/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    move-object v6, v0

    .line 26
    iget-object p4, v6, Lorg/burnoutcrew/reorderable/m$a;->result:Ljava/lang/Object;

    .line 27
    .line 28
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget v1, v6, Lorg/burnoutcrew/reorderable/m$a;->label:I

    .line 33
    .line 34
    const/4 v9, 0x0

    .line 35
    const/4 v2, 0x2

    .line 36
    const/4 v3, 0x1

    .line 37
    if-eqz v1, :cond_3

    .line 38
    .line 39
    if-eq v1, v3, :cond_2

    .line 40
    .line 41
    if-ne v1, v2, :cond_1

    .line 42
    .line 43
    iget-object p1, v6, Lorg/burnoutcrew/reorderable/m$a;->L$0:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Lorg/burnoutcrew/reorderable/m;

    .line 46
    .line 47
    invoke-static {p4}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_2
    iget-object p1, v6, Lorg/burnoutcrew/reorderable/m$a;->L$0:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p1, Lorg/burnoutcrew/reorderable/m;

    .line 62
    .line 63
    invoke-static {p4}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    invoke-static {p4}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-direct {p0, p1}, Lorg/burnoutcrew/reorderable/m;->c(Lorg/burnoutcrew/reorderable/d;)V

    .line 71
    .line 72
    .line 73
    iget-object p1, p0, Lorg/burnoutcrew/reorderable/m;->b:Landroidx/compose/animation/core/Animatable;

    .line 74
    .line 75
    invoke-static {p2, p3}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    iput-object p0, v6, Lorg/burnoutcrew/reorderable/m$a;->L$0:Ljava/lang/Object;

    .line 80
    .line 81
    iput v3, v6, Lorg/burnoutcrew/reorderable/m$a;->label:I

    .line 82
    .line 83
    invoke-virtual {p1, p2, v6}, Landroidx/compose/animation/core/Animatable;->snapTo(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    if-ne p1, v0, :cond_4

    .line 88
    .line 89
    return-object v0

    .line 90
    :cond_4
    move-object p1, p0

    .line 91
    :goto_1
    iget-object v1, p1, Lorg/burnoutcrew/reorderable/m;->b:Landroidx/compose/animation/core/Animatable;

    .line 92
    .line 93
    sget-object p2, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 94
    .line 95
    invoke-virtual {p2}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 96
    .line 97
    .line 98
    move-result-wide p3

    .line 99
    invoke-static {p3, p4}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    .line 100
    .line 101
    .line 102
    move-result-object p3

    .line 103
    iget p4, p1, Lorg/burnoutcrew/reorderable/m;->a:F

    .line 104
    .line 105
    invoke-static {p2}, Landroidx/compose/animation/core/VisibilityThresholdsKt;->getVisibilityThreshold(Landroidx/compose/ui/geometry/Offset$Companion;)J

    .line 106
    .line 107
    .line 108
    move-result-wide v4

    .line 109
    invoke-static {v4, v5}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    const/4 v4, 0x0

    .line 114
    invoke-static {v4, p4, p2, v3, v9}, Landroidx/compose/animation/core/AnimationSpecKt;->spring$default(FFLjava/lang/Object;ILjava/lang/Object;)Landroidx/compose/animation/core/SpringSpec;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    const/4 v4, 0x0

    .line 119
    const/4 v5, 0x0

    .line 120
    const/16 v7, 0xc

    .line 121
    .line 122
    const/4 v8, 0x0

    .line 123
    iput-object p1, v6, Lorg/burnoutcrew/reorderable/m$a;->L$0:Ljava/lang/Object;

    .line 124
    .line 125
    iput v2, v6, Lorg/burnoutcrew/reorderable/m$a;->label:I

    .line 126
    .line 127
    move-object v2, p3

    .line 128
    invoke-static/range {v1 .. v8}, Landroidx/compose/animation/core/Animatable;->animateTo$default(Landroidx/compose/animation/core/Animatable;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Lv3/l;Lkotlin/coroutines/d;ILjava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    if-ne p2, v0, :cond_5

    .line 133
    .line 134
    return-object v0

    .line 135
    :cond_5
    :goto_2
    invoke-direct {p1, v9}, Lorg/burnoutcrew/reorderable/m;->c(Lorg/burnoutcrew/reorderable/d;)V

    .line 136
    .line 137
    .line 138
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 139
    .line 140
    return-object p1
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
.end method

.method public b()J
    .locals 2

    iget-object v0, p0, Lorg/burnoutcrew/reorderable/m;->b:Landroidx/compose/animation/core/Animatable;

    invoke-virtual {v0}, Landroidx/compose/animation/core/Animatable;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/geometry/Offset;

    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Offset;->unbox-impl()J

    move-result-wide v0

    return-wide v0
.end method

.method public getPosition()Lorg/burnoutcrew/reorderable/d;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/burnoutcrew/reorderable/m;->c:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lorg/burnoutcrew/reorderable/d;

    .line 8
    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
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
.end method
