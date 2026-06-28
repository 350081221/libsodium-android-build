.class final Lcom/airbnb/lottie/compose/b$a;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/airbnb/lottie/compose/b;->e(Lcom/airbnb/lottie/k;IIZFLcom/airbnb/lottie/compose/g;FZLcom/airbnb/lottie/compose/f;ZZLkotlin/coroutines/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/airbnb/lottie/compose/b$a$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/o;",
        "Lv3/l<",
        "Lkotlin/coroutines/d<",
        "-",
        "Lkotlin/r2;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2"
    f = "LottieAnimatable.kt"
    i = {}
    l = {
        0x10d
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"
    }
    d2 = {
        "<anonymous>",
        ""
    }
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $cancellationBehavior:Lcom/airbnb/lottie/compose/f;

.field final synthetic $clipSpec:Lcom/airbnb/lottie/compose/g;

.field final synthetic $composition:Lcom/airbnb/lottie/k;

.field final synthetic $continueFromPreviousAnimate:Z

.field final synthetic $initialProgress:F

.field final synthetic $iteration:I

.field final synthetic $iterations:I

.field final synthetic $reverseOnRepeat:Z

.field final synthetic $speed:F

.field final synthetic $useCompositionFrameRate:Z

.field label:I

.field final synthetic this$0:Lcom/airbnb/lottie/compose/b;


# direct methods
.method constructor <init>(Lcom/airbnb/lottie/compose/b;IIZFLcom/airbnb/lottie/compose/g;Lcom/airbnb/lottie/k;FZZLcom/airbnb/lottie/compose/f;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/airbnb/lottie/compose/b;",
            "IIZF",
            "Lcom/airbnb/lottie/compose/g;",
            "Lcom/airbnb/lottie/k;",
            "FZZ",
            "Lcom/airbnb/lottie/compose/f;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lcom/airbnb/lottie/compose/b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/airbnb/lottie/compose/b$a;->this$0:Lcom/airbnb/lottie/compose/b;

    iput p2, p0, Lcom/airbnb/lottie/compose/b$a;->$iteration:I

    iput p3, p0, Lcom/airbnb/lottie/compose/b$a;->$iterations:I

    iput-boolean p4, p0, Lcom/airbnb/lottie/compose/b$a;->$reverseOnRepeat:Z

    iput p5, p0, Lcom/airbnb/lottie/compose/b$a;->$speed:F

    iput-object p6, p0, Lcom/airbnb/lottie/compose/b$a;->$clipSpec:Lcom/airbnb/lottie/compose/g;

    iput-object p7, p0, Lcom/airbnb/lottie/compose/b$a;->$composition:Lcom/airbnb/lottie/k;

    iput p8, p0, Lcom/airbnb/lottie/compose/b$a;->$initialProgress:F

    iput-boolean p9, p0, Lcom/airbnb/lottie/compose/b$a;->$useCompositionFrameRate:Z

    iput-boolean p10, p0, Lcom/airbnb/lottie/compose/b$a;->$continueFromPreviousAnimate:Z

    iput-object p11, p0, Lcom/airbnb/lottie/compose/b$a;->$cancellationBehavior:Lcom/airbnb/lottie/compose/f;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p12}, Lkotlin/coroutines/jvm/internal/o;-><init>(ILkotlin/coroutines/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lkotlin/coroutines/d;)Lkotlin/coroutines/d;
    .locals 14
    .param p1    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/d<",
            "*>;)",
            "Lkotlin/coroutines/d<",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    new-instance v13, Lcom/airbnb/lottie/compose/b$a;

    iget-object v1, p0, Lcom/airbnb/lottie/compose/b$a;->this$0:Lcom/airbnb/lottie/compose/b;

    iget v2, p0, Lcom/airbnb/lottie/compose/b$a;->$iteration:I

    iget v3, p0, Lcom/airbnb/lottie/compose/b$a;->$iterations:I

    iget-boolean v4, p0, Lcom/airbnb/lottie/compose/b$a;->$reverseOnRepeat:Z

    iget v5, p0, Lcom/airbnb/lottie/compose/b$a;->$speed:F

    iget-object v6, p0, Lcom/airbnb/lottie/compose/b$a;->$clipSpec:Lcom/airbnb/lottie/compose/g;

    iget-object v7, p0, Lcom/airbnb/lottie/compose/b$a;->$composition:Lcom/airbnb/lottie/k;

    iget v8, p0, Lcom/airbnb/lottie/compose/b$a;->$initialProgress:F

    iget-boolean v9, p0, Lcom/airbnb/lottie/compose/b$a;->$useCompositionFrameRate:Z

    iget-boolean v10, p0, Lcom/airbnb/lottie/compose/b$a;->$continueFromPreviousAnimate:Z

    iget-object v11, p0, Lcom/airbnb/lottie/compose/b$a;->$cancellationBehavior:Lcom/airbnb/lottie/compose/f;

    move-object v0, v13

    move-object v12, p1

    invoke-direct/range {v0 .. v12}, Lcom/airbnb/lottie/compose/b$a;-><init>(Lcom/airbnb/lottie/compose/b;IIZFLcom/airbnb/lottie/compose/g;Lcom/airbnb/lottie/k;FZZLcom/airbnb/lottie/compose/f;Lkotlin/coroutines/d;)V

    return-object v13
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1}, Lcom/airbnb/lottie/compose/b$a;->invoke(Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 1
    .param p1    # Lkotlin/coroutines/d;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-virtual {p0, p1}, Lcom/airbnb/lottie/compose/b$a;->create(Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Lcom/airbnb/lottie/compose/b$a;

    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, v0}, Lcom/airbnb/lottie/compose/b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11
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
    iget v1, p0, Lcom/airbnb/lottie/compose/b$a;->label:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    if-ne v1, v3, :cond_0

    .line 12
    .line 13
    :try_start_0
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    .line 16
    goto/16 :goto_1

    .line 17
    .line 18
    :catchall_0
    move-exception p1

    .line 19
    goto/16 :goto_2

    .line 20
    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lcom/airbnb/lottie/compose/b$a;->this$0:Lcom/airbnb/lottie/compose/b;

    .line 33
    .line 34
    iget v1, p0, Lcom/airbnb/lottie/compose/b$a;->$iteration:I

    .line 35
    .line 36
    invoke-static {p1, v1}, Lcom/airbnb/lottie/compose/b;->u(Lcom/airbnb/lottie/compose/b;I)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lcom/airbnb/lottie/compose/b$a;->this$0:Lcom/airbnb/lottie/compose/b;

    .line 40
    .line 41
    iget v1, p0, Lcom/airbnb/lottie/compose/b$a;->$iterations:I

    .line 42
    .line 43
    invoke-static {p1, v1}, Lcom/airbnb/lottie/compose/b;->v(Lcom/airbnb/lottie/compose/b;I)V

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, Lcom/airbnb/lottie/compose/b$a;->this$0:Lcom/airbnb/lottie/compose/b;

    .line 47
    .line 48
    iget-boolean v1, p0, Lcom/airbnb/lottie/compose/b$a;->$reverseOnRepeat:Z

    .line 49
    .line 50
    invoke-static {p1, v1}, Lcom/airbnb/lottie/compose/b;->y(Lcom/airbnb/lottie/compose/b;Z)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lcom/airbnb/lottie/compose/b$a;->this$0:Lcom/airbnb/lottie/compose/b;

    .line 54
    .line 55
    iget v1, p0, Lcom/airbnb/lottie/compose/b$a;->$speed:F

    .line 56
    .line 57
    invoke-static {p1, v1}, Lcom/airbnb/lottie/compose/b;->z(Lcom/airbnb/lottie/compose/b;F)V

    .line 58
    .line 59
    .line 60
    iget-object p1, p0, Lcom/airbnb/lottie/compose/b$a;->this$0:Lcom/airbnb/lottie/compose/b;

    .line 61
    .line 62
    iget-object v1, p0, Lcom/airbnb/lottie/compose/b$a;->$clipSpec:Lcom/airbnb/lottie/compose/g;

    .line 63
    .line 64
    invoke-static {p1, v1}, Lcom/airbnb/lottie/compose/b;->s(Lcom/airbnb/lottie/compose/b;Lcom/airbnb/lottie/compose/g;)V

    .line 65
    .line 66
    .line 67
    iget-object p1, p0, Lcom/airbnb/lottie/compose/b$a;->this$0:Lcom/airbnb/lottie/compose/b;

    .line 68
    .line 69
    iget-object v1, p0, Lcom/airbnb/lottie/compose/b$a;->$composition:Lcom/airbnb/lottie/k;

    .line 70
    .line 71
    invoke-static {p1, v1}, Lcom/airbnb/lottie/compose/b;->t(Lcom/airbnb/lottie/compose/b;Lcom/airbnb/lottie/k;)V

    .line 72
    .line 73
    .line 74
    iget-object p1, p0, Lcom/airbnb/lottie/compose/b$a;->this$0:Lcom/airbnb/lottie/compose/b;

    .line 75
    .line 76
    iget v1, p0, Lcom/airbnb/lottie/compose/b$a;->$initialProgress:F

    .line 77
    .line 78
    invoke-static {p1, v1}, Lcom/airbnb/lottie/compose/b;->B(Lcom/airbnb/lottie/compose/b;F)V

    .line 79
    .line 80
    .line 81
    iget-object p1, p0, Lcom/airbnb/lottie/compose/b$a;->this$0:Lcom/airbnb/lottie/compose/b;

    .line 82
    .line 83
    iget-boolean v1, p0, Lcom/airbnb/lottie/compose/b$a;->$useCompositionFrameRate:Z

    .line 84
    .line 85
    invoke-static {p1, v1}, Lcom/airbnb/lottie/compose/b;->A(Lcom/airbnb/lottie/compose/b;Z)V

    .line 86
    .line 87
    .line 88
    iget-boolean p1, p0, Lcom/airbnb/lottie/compose/b$a;->$continueFromPreviousAnimate:Z

    .line 89
    .line 90
    if-nez p1, :cond_2

    .line 91
    .line 92
    iget-object p1, p0, Lcom/airbnb/lottie/compose/b$a;->this$0:Lcom/airbnb/lottie/compose/b;

    .line 93
    .line 94
    const-wide/high16 v4, -0x8000000000000000L

    .line 95
    .line 96
    invoke-static {p1, v4, v5}, Lcom/airbnb/lottie/compose/b;->w(Lcom/airbnb/lottie/compose/b;J)V

    .line 97
    .line 98
    .line 99
    :cond_2
    iget-object p1, p0, Lcom/airbnb/lottie/compose/b$a;->$composition:Lcom/airbnb/lottie/k;

    .line 100
    .line 101
    if-nez p1, :cond_3

    .line 102
    .line 103
    iget-object p1, p0, Lcom/airbnb/lottie/compose/b$a;->this$0:Lcom/airbnb/lottie/compose/b;

    .line 104
    .line 105
    invoke-static {p1, v2}, Lcom/airbnb/lottie/compose/b;->x(Lcom/airbnb/lottie/compose/b;Z)V

    .line 106
    .line 107
    .line 108
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 109
    .line 110
    return-object p1

    .line 111
    :cond_3
    iget p1, p0, Lcom/airbnb/lottie/compose/b$a;->$speed:F

    .line 112
    .line 113
    invoke-static {p1}, Ljava/lang/Float;->isInfinite(F)Z

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    if-eqz p1, :cond_4

    .line 118
    .line 119
    iget-object p1, p0, Lcom/airbnb/lottie/compose/b$a;->this$0:Lcom/airbnb/lottie/compose/b;

    .line 120
    .line 121
    invoke-static {p1}, Lcom/airbnb/lottie/compose/b;->h(Lcom/airbnb/lottie/compose/b;)F

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    invoke-static {p1, v0}, Lcom/airbnb/lottie/compose/b;->B(Lcom/airbnb/lottie/compose/b;F)V

    .line 126
    .line 127
    .line 128
    iget-object p1, p0, Lcom/airbnb/lottie/compose/b$a;->this$0:Lcom/airbnb/lottie/compose/b;

    .line 129
    .line 130
    invoke-static {p1, v2}, Lcom/airbnb/lottie/compose/b;->x(Lcom/airbnb/lottie/compose/b;Z)V

    .line 131
    .line 132
    .line 133
    iget-object p1, p0, Lcom/airbnb/lottie/compose/b$a;->this$0:Lcom/airbnb/lottie/compose/b;

    .line 134
    .line 135
    iget v0, p0, Lcom/airbnb/lottie/compose/b$a;->$iterations:I

    .line 136
    .line 137
    invoke-static {p1, v0}, Lcom/airbnb/lottie/compose/b;->u(Lcom/airbnb/lottie/compose/b;I)V

    .line 138
    .line 139
    .line 140
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 141
    .line 142
    return-object p1

    .line 143
    :cond_4
    iget-object p1, p0, Lcom/airbnb/lottie/compose/b$a;->this$0:Lcom/airbnb/lottie/compose/b;

    .line 144
    .line 145
    invoke-static {p1, v3}, Lcom/airbnb/lottie/compose/b;->x(Lcom/airbnb/lottie/compose/b;Z)V

    .line 146
    .line 147
    .line 148
    :try_start_1
    iget-object p1, p0, Lcom/airbnb/lottie/compose/b$a;->$cancellationBehavior:Lcom/airbnb/lottie/compose/f;

    .line 149
    .line 150
    sget-object v1, Lcom/airbnb/lottie/compose/b$a$b;->a:[I

    .line 151
    .line 152
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    aget p1, v1, p1

    .line 157
    .line 158
    if-eq p1, v3, :cond_6

    .line 159
    .line 160
    const/4 v1, 0x2

    .line 161
    if-ne p1, v1, :cond_5

    .line 162
    .line 163
    sget-object p1, Lkotlin/coroutines/i;->INSTANCE:Lkotlin/coroutines/i;

    .line 164
    .line 165
    goto :goto_0

    .line 166
    :cond_5
    new-instance p1, Lkotlin/j0;

    .line 167
    .line 168
    invoke-direct {p1}, Lkotlin/j0;-><init>()V

    .line 169
    .line 170
    .line 171
    throw p1

    .line 172
    :cond_6
    sget-object p1, Lkotlinx/coroutines/z2;->a:Lkotlinx/coroutines/z2;

    .line 173
    .line 174
    :goto_0
    invoke-interface {p0}, Lkotlin/coroutines/d;->getContext()Lkotlin/coroutines/g;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    invoke-static {v1}, Lkotlinx/coroutines/p2;->B(Lkotlin/coroutines/g;)Lkotlinx/coroutines/l2;

    .line 179
    .line 180
    .line 181
    move-result-object v6

    .line 182
    new-instance v1, Lcom/airbnb/lottie/compose/b$a$a;

    .line 183
    .line 184
    iget-object v5, p0, Lcom/airbnb/lottie/compose/b$a;->$cancellationBehavior:Lcom/airbnb/lottie/compose/f;

    .line 185
    .line 186
    iget v7, p0, Lcom/airbnb/lottie/compose/b$a;->$iterations:I

    .line 187
    .line 188
    iget v8, p0, Lcom/airbnb/lottie/compose/b$a;->$iteration:I

    .line 189
    .line 190
    iget-object v9, p0, Lcom/airbnb/lottie/compose/b$a;->this$0:Lcom/airbnb/lottie/compose/b;

    .line 191
    .line 192
    const/4 v10, 0x0

    .line 193
    move-object v4, v1

    .line 194
    invoke-direct/range {v4 .. v10}, Lcom/airbnb/lottie/compose/b$a$a;-><init>(Lcom/airbnb/lottie/compose/f;Lkotlinx/coroutines/l2;IILcom/airbnb/lottie/compose/b;Lkotlin/coroutines/d;)V

    .line 195
    .line 196
    .line 197
    iput v3, p0, Lcom/airbnb/lottie/compose/b$a;->label:I

    .line 198
    .line 199
    invoke-static {p1, v1, p0}, Lkotlinx/coroutines/i;->h(Lkotlin/coroutines/g;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    if-ne p1, v0, :cond_7

    .line 204
    .line 205
    return-object v0

    .line 206
    :cond_7
    :goto_1
    invoke-interface {p0}, Lkotlin/coroutines/d;->getContext()Lkotlin/coroutines/g;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    invoke-static {p1}, Lkotlinx/coroutines/p2;->z(Lkotlin/coroutines/g;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 211
    .line 212
    .line 213
    iget-object p1, p0, Lcom/airbnb/lottie/compose/b$a;->this$0:Lcom/airbnb/lottie/compose/b;

    .line 214
    .line 215
    invoke-static {p1, v2}, Lcom/airbnb/lottie/compose/b;->x(Lcom/airbnb/lottie/compose/b;Z)V

    .line 216
    .line 217
    .line 218
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 219
    .line 220
    return-object p1

    .line 221
    :goto_2
    iget-object v0, p0, Lcom/airbnb/lottie/compose/b$a;->this$0:Lcom/airbnb/lottie/compose/b;

    .line 222
    .line 223
    invoke-static {v0, v2}, Lcom/airbnb/lottie/compose/b;->x(Lcom/airbnb/lottie/compose/b;Z)V

    .line 224
    .line 225
    .line 226
    throw p1
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
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
