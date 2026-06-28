.class final Lkotlinx/coroutines/channels/v$m0;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlinx/coroutines/channels/v;->g0(Lkotlinx/coroutines/channels/g0;Lkotlinx/coroutines/channels/g0;Lkotlin/coroutines/g;Lv3/p;)Lkotlinx/coroutines/channels/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/o;",
        "Lv3/p<",
        "Lkotlinx/coroutines/channels/e0<",
        "-TV;>;",
        "Lkotlin/coroutines/d<",
        "-",
        "Lkotlin/r2;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2"
    f = "Deprecated.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2
    }
    l = {
        0x1e7,
        0x1d5,
        0x1d7
    }
    m = "invokeSuspend"
    n = {
        "$this$produce",
        "otherIterator",
        "$this$consume$iv$iv",
        "$this$produce",
        "otherIterator",
        "$this$consume$iv$iv",
        "element1",
        "$this$produce",
        "otherIterator",
        "$this$consume$iv$iv"
    }
    s = {
        "L$0",
        "L$1",
        "L$3",
        "L$0",
        "L$1",
        "L$3",
        "L$5",
        "L$0",
        "L$1",
        "L$3"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001\"\u0004\u0008\u0002\u0010\u0002*\u0008\u0012\u0004\u0012\u00028\u00020\u0003H\u008a@"
    }
    d2 = {
        "E",
        "R",
        "V",
        "Lkotlinx/coroutines/channels/e0;",
        "Lkotlin/r2;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$zip$2\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,479:1\n105#2:480\n82#2,6:481\n106#2,2:487\n92#2:489\n88#2,3:490\n*S KotlinDebug\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$zip$2\n*L\n468#1:480\n468#1:481,6\n468#1:487,2\n468#1:489\n468#1:490,3\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $other:Lkotlinx/coroutines/channels/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/channels/g0<",
            "TR;>;"
        }
    .end annotation
.end field

.field final synthetic $this_zip:Lkotlinx/coroutines/channels/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/channels/g0<",
            "TE;>;"
        }
    .end annotation
.end field

.field final synthetic $transform:Lv3/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/p<",
            "TE;TR;TV;>;"
        }
    .end annotation
.end field

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Lkotlinx/coroutines/channels/g0;Lkotlinx/coroutines/channels/g0;Lv3/p;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/channels/g0<",
            "+TR;>;",
            "Lkotlinx/coroutines/channels/g0<",
            "+TE;>;",
            "Lv3/p<",
            "-TE;-TR;+TV;>;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlinx/coroutines/channels/v$m0;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lkotlinx/coroutines/channels/v$m0;->$other:Lkotlinx/coroutines/channels/g0;

    iput-object p2, p0, Lkotlinx/coroutines/channels/v$m0;->$this_zip:Lkotlinx/coroutines/channels/g0;

    iput-object p3, p0, Lkotlinx/coroutines/channels/v$m0;->$transform:Lv3/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/o;-><init>(ILkotlin/coroutines/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;
    .locals 4
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

    new-instance v0, Lkotlinx/coroutines/channels/v$m0;

    iget-object v1, p0, Lkotlinx/coroutines/channels/v$m0;->$other:Lkotlinx/coroutines/channels/g0;

    iget-object v2, p0, Lkotlinx/coroutines/channels/v$m0;->$this_zip:Lkotlinx/coroutines/channels/g0;

    iget-object v3, p0, Lkotlinx/coroutines/channels/v$m0;->$transform:Lv3/p;

    invoke-direct {v0, v1, v2, v3, p2}, Lkotlinx/coroutines/channels/v$m0;-><init>(Lkotlinx/coroutines/channels/g0;Lkotlinx/coroutines/channels/g0;Lv3/p;Lkotlin/coroutines/d;)V

    iput-object p1, v0, Lkotlinx/coroutines/channels/v$m0;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/channels/e0;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/channels/v$m0;->invoke(Lkotlinx/coroutines/channels/e0;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/channels/e0;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lkotlinx/coroutines/channels/e0;
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
            "Lkotlinx/coroutines/channels/e0<",
            "-TV;>;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/channels/v$m0;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Lkotlinx/coroutines/channels/v$m0;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Lkotlinx/coroutines/channels/v$m0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lkotlinx/coroutines/channels/v$m0;->label:I

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    if-eqz v1, :cond_3

    .line 12
    .line 13
    if-eq v1, v4, :cond_2

    .line 14
    .line 15
    if-eq v1, v3, :cond_1

    .line 16
    .line 17
    if-ne v1, v2, :cond_0

    .line 18
    .line 19
    iget-object v1, p0, Lkotlinx/coroutines/channels/v$m0;->L$4:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Lkotlinx/coroutines/channels/n;

    .line 22
    .line 23
    iget-object v6, p0, Lkotlinx/coroutines/channels/v$m0;->L$3:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v6, Lkotlinx/coroutines/channels/g0;

    .line 26
    .line 27
    iget-object v7, p0, Lkotlinx/coroutines/channels/v$m0;->L$2:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v7, Lv3/p;

    .line 30
    .line 31
    iget-object v8, p0, Lkotlinx/coroutines/channels/v$m0;->L$1:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v8, Lkotlinx/coroutines/channels/n;

    .line 34
    .line 35
    iget-object v9, p0, Lkotlinx/coroutines/channels/v$m0;->L$0:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v9, Lkotlinx/coroutines/channels/e0;

    .line 38
    .line 39
    :try_start_0
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 40
    .line 41
    .line 42
    move-object v10, v8

    .line 43
    move-object v8, v6

    .line 44
    move-object v6, v1

    .line 45
    move-object v1, v0

    .line 46
    move-object v0, p0

    .line 47
    goto/16 :goto_3

    .line 48
    .line 49
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1

    .line 57
    :cond_1
    iget-object v1, p0, Lkotlinx/coroutines/channels/v$m0;->L$5:Ljava/lang/Object;

    .line 58
    .line 59
    iget-object v6, p0, Lkotlinx/coroutines/channels/v$m0;->L$4:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v6, Lkotlinx/coroutines/channels/n;

    .line 62
    .line 63
    iget-object v7, p0, Lkotlinx/coroutines/channels/v$m0;->L$3:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v7, Lkotlinx/coroutines/channels/g0;

    .line 66
    .line 67
    iget-object v8, p0, Lkotlinx/coroutines/channels/v$m0;->L$2:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v8, Lv3/p;

    .line 70
    .line 71
    iget-object v9, p0, Lkotlinx/coroutines/channels/v$m0;->L$1:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v9, Lkotlinx/coroutines/channels/n;

    .line 74
    .line 75
    iget-object v10, p0, Lkotlinx/coroutines/channels/v$m0;->L$0:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v10, Lkotlinx/coroutines/channels/e0;

    .line 78
    .line 79
    :try_start_1
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 80
    .line 81
    .line 82
    move-object v11, v10

    .line 83
    move-object v10, v9

    .line 84
    move-object v9, v8

    .line 85
    move-object v8, v7

    .line 86
    move-object v7, v1

    .line 87
    move-object v1, v0

    .line 88
    move-object v0, p0

    .line 89
    goto/16 :goto_2

    .line 90
    .line 91
    :catchall_0
    move-exception p1

    .line 92
    move-object v6, v7

    .line 93
    goto/16 :goto_4

    .line 94
    .line 95
    :cond_2
    iget-object v1, p0, Lkotlinx/coroutines/channels/v$m0;->L$4:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v1, Lkotlinx/coroutines/channels/n;

    .line 98
    .line 99
    iget-object v6, p0, Lkotlinx/coroutines/channels/v$m0;->L$3:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v6, Lkotlinx/coroutines/channels/g0;

    .line 102
    .line 103
    iget-object v7, p0, Lkotlinx/coroutines/channels/v$m0;->L$2:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v7, Lv3/p;

    .line 106
    .line 107
    iget-object v8, p0, Lkotlinx/coroutines/channels/v$m0;->L$1:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v8, Lkotlinx/coroutines/channels/n;

    .line 110
    .line 111
    iget-object v9, p0, Lkotlinx/coroutines/channels/v$m0;->L$0:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v9, Lkotlinx/coroutines/channels/e0;

    .line 114
    .line 115
    :try_start_2
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 116
    .line 117
    .line 118
    move-object v10, v9

    .line 119
    move-object v9, v8

    .line 120
    move-object v8, v7

    .line 121
    move-object v7, v6

    .line 122
    move-object v6, v1

    .line 123
    move-object v1, v0

    .line 124
    move-object v0, p0

    .line 125
    goto :goto_1

    .line 126
    :cond_3
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    iget-object p1, p0, Lkotlinx/coroutines/channels/v$m0;->L$0:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast p1, Lkotlinx/coroutines/channels/e0;

    .line 132
    .line 133
    iget-object v1, p0, Lkotlinx/coroutines/channels/v$m0;->$other:Lkotlinx/coroutines/channels/g0;

    .line 134
    .line 135
    invoke-interface {v1}, Lkotlinx/coroutines/channels/g0;->iterator()Lkotlinx/coroutines/channels/n;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    iget-object v6, p0, Lkotlinx/coroutines/channels/v$m0;->$this_zip:Lkotlinx/coroutines/channels/g0;

    .line 140
    .line 141
    iget-object v7, p0, Lkotlinx/coroutines/channels/v$m0;->$transform:Lv3/p;

    .line 142
    .line 143
    :try_start_3
    invoke-interface {v6}, Lkotlinx/coroutines/channels/g0;->iterator()Lkotlinx/coroutines/channels/n;

    .line 144
    .line 145
    .line 146
    move-result-object v8

    .line 147
    move-object v9, p1

    .line 148
    move-object p1, p0

    .line 149
    move-object v12, v8

    .line 150
    move-object v8, v1

    .line 151
    move-object v1, v12

    .line 152
    :goto_0
    iput-object v9, p1, Lkotlinx/coroutines/channels/v$m0;->L$0:Ljava/lang/Object;

    .line 153
    .line 154
    iput-object v8, p1, Lkotlinx/coroutines/channels/v$m0;->L$1:Ljava/lang/Object;

    .line 155
    .line 156
    iput-object v7, p1, Lkotlinx/coroutines/channels/v$m0;->L$2:Ljava/lang/Object;

    .line 157
    .line 158
    iput-object v6, p1, Lkotlinx/coroutines/channels/v$m0;->L$3:Ljava/lang/Object;

    .line 159
    .line 160
    iput-object v1, p1, Lkotlinx/coroutines/channels/v$m0;->L$4:Ljava/lang/Object;

    .line 161
    .line 162
    iput-object v5, p1, Lkotlinx/coroutines/channels/v$m0;->L$5:Ljava/lang/Object;

    .line 163
    .line 164
    iput v4, p1, Lkotlinx/coroutines/channels/v$m0;->label:I

    .line 165
    .line 166
    invoke-interface {v1, p1}, Lkotlinx/coroutines/channels/n;->c(Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v10
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 170
    if-ne v10, v0, :cond_4

    .line 171
    .line 172
    return-object v0

    .line 173
    :cond_4
    move-object v12, v0

    .line 174
    move-object v0, p1

    .line 175
    move-object p1, v10

    .line 176
    move-object v10, v9

    .line 177
    move-object v9, v8

    .line 178
    move-object v8, v7

    .line 179
    move-object v7, v6

    .line 180
    move-object v6, v1

    .line 181
    move-object v1, v12

    .line 182
    :goto_1
    :try_start_4
    check-cast p1, Ljava/lang/Boolean;

    .line 183
    .line 184
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 185
    .line 186
    .line 187
    move-result p1

    .line 188
    if-eqz p1, :cond_8

    .line 189
    .line 190
    invoke-interface {v6}, Lkotlinx/coroutines/channels/n;->next()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    iput-object v10, v0, Lkotlinx/coroutines/channels/v$m0;->L$0:Ljava/lang/Object;

    .line 195
    .line 196
    iput-object v9, v0, Lkotlinx/coroutines/channels/v$m0;->L$1:Ljava/lang/Object;

    .line 197
    .line 198
    iput-object v8, v0, Lkotlinx/coroutines/channels/v$m0;->L$2:Ljava/lang/Object;

    .line 199
    .line 200
    iput-object v7, v0, Lkotlinx/coroutines/channels/v$m0;->L$3:Ljava/lang/Object;

    .line 201
    .line 202
    iput-object v6, v0, Lkotlinx/coroutines/channels/v$m0;->L$4:Ljava/lang/Object;

    .line 203
    .line 204
    iput-object p1, v0, Lkotlinx/coroutines/channels/v$m0;->L$5:Ljava/lang/Object;

    .line 205
    .line 206
    iput v3, v0, Lkotlinx/coroutines/channels/v$m0;->label:I

    .line 207
    .line 208
    invoke-interface {v9, v0}, Lkotlinx/coroutines/channels/n;->c(Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v11
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 212
    if-ne v11, v1, :cond_5

    .line 213
    .line 214
    return-object v1

    .line 215
    :cond_5
    move-object v12, v7

    .line 216
    move-object v7, p1

    .line 217
    move-object p1, v11

    .line 218
    move-object v11, v10

    .line 219
    move-object v10, v9

    .line 220
    move-object v9, v8

    .line 221
    move-object v8, v12

    .line 222
    :goto_2
    :try_start_5
    check-cast p1, Ljava/lang/Boolean;

    .line 223
    .line 224
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 225
    .line 226
    .line 227
    move-result p1

    .line 228
    if-eqz p1, :cond_7

    .line 229
    .line 230
    invoke-interface {v10}, Lkotlinx/coroutines/channels/n;->next()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    invoke-interface {v9, v7, p1}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    iput-object v11, v0, Lkotlinx/coroutines/channels/v$m0;->L$0:Ljava/lang/Object;

    .line 239
    .line 240
    iput-object v10, v0, Lkotlinx/coroutines/channels/v$m0;->L$1:Ljava/lang/Object;

    .line 241
    .line 242
    iput-object v9, v0, Lkotlinx/coroutines/channels/v$m0;->L$2:Ljava/lang/Object;

    .line 243
    .line 244
    iput-object v8, v0, Lkotlinx/coroutines/channels/v$m0;->L$3:Ljava/lang/Object;

    .line 245
    .line 246
    iput-object v6, v0, Lkotlinx/coroutines/channels/v$m0;->L$4:Ljava/lang/Object;

    .line 247
    .line 248
    iput-object v5, v0, Lkotlinx/coroutines/channels/v$m0;->L$5:Ljava/lang/Object;

    .line 249
    .line 250
    iput v2, v0, Lkotlinx/coroutines/channels/v$m0;->label:I

    .line 251
    .line 252
    invoke-interface {v11, p1, v0}, Lkotlinx/coroutines/channels/h0;->F(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 256
    if-ne p1, v1, :cond_6

    .line 257
    .line 258
    return-object v1

    .line 259
    :cond_6
    move-object v7, v9

    .line 260
    move-object v9, v11

    .line 261
    :goto_3
    move-object p1, v0

    .line 262
    move-object v0, v1

    .line 263
    move-object v1, v6

    .line 264
    move-object v6, v8

    .line 265
    move-object v8, v10

    .line 266
    goto :goto_0

    .line 267
    :cond_7
    move-object p1, v0

    .line 268
    move-object v0, v1

    .line 269
    move-object v1, v6

    .line 270
    move-object v6, v8

    .line 271
    move-object v7, v9

    .line 272
    move-object v8, v10

    .line 273
    move-object v9, v11

    .line 274
    goto :goto_0

    .line 275
    :catchall_1
    move-exception p1

    .line 276
    move-object v6, v8

    .line 277
    goto :goto_4

    .line 278
    :cond_8
    :try_start_6
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 279
    .line 280
    invoke-static {v7, v5}, Lkotlinx/coroutines/channels/s;->b(Lkotlinx/coroutines/channels/g0;Ljava/lang/Throwable;)V

    .line 281
    .line 282
    .line 283
    return-object p1

    .line 284
    :catchall_2
    move-exception p1

    .line 285
    :goto_4
    :try_start_7
    throw p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 286
    :catchall_3
    move-exception v0

    .line 287
    invoke-static {v6, p1}, Lkotlinx/coroutines/channels/s;->b(Lkotlinx/coroutines/channels/g0;Ljava/lang/Throwable;)V

    .line 288
    .line 289
    .line 290
    throw v0
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
.end method
