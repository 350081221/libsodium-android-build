.class public final Lcom/yuanqi/master/tools/w0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\n\n\u0002\u0010\u0011\n\u0002\u0008\u0002\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0008J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cJ!\u0010\r\u001a\u0002H\u000e\"\u0004\u0008\u0000\u0010\u000e2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u0002H\u000e\u00a2\u0006\u0002\u0010\u0010J!\u0010\u0011\u001a\u00020\u0008\"\u0004\u0008\u0000\u0010\u000e2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u0012\u001a\u0002H\u000e\u00a2\u0006\u0002\u0010\u0013J\u000e\u0010\u0014\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\u000cJ\u0019\u0010\u0015\u001a\u00020\u00082\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0017\u00a2\u0006\u0002\u0010\u0018R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/yuanqi/master/tools/MMKVUtils;",
        "",
        "()V",
        "mmkv",
        "Lcom/tencent/mmkv/MMKV;",
        "getMmkv",
        "()Lcom/tencent/mmkv/MMKV;",
        "clearAll",
        "",
        "contains",
        "",
        "key",
        "",
        "decode",
        "T",
        "defValue",
        "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;",
        "encode",
        "value",
        "(Ljava/lang/String;Ljava/lang/Object;)V",
        "remove",
        "removeArray",
        "keys",
        "",
        "([Ljava/lang/String;)V",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lcom/yuanqi/master/tools/w0;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final b:Lcom/tencent/mmkv/MMKV;
    .annotation build Lp4/l;
    .end annotation
.end field

.field public static final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/yuanqi/master/tools/w0;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/yuanqi/master/tools/w0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/yuanqi/master/tools/w0;->a:Lcom/yuanqi/master/tools/w0;

    .line 7
    .line 8
    invoke-static {}, Lcom/tencent/mmkv/MMKV;->defaultMMKV()Lcom/tencent/mmkv/MMKV;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "defaultMMKV(...)"

    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lcom/yuanqi/master/tools/w0;->b:Lcom/tencent/mmkv/MMKV;

    .line 18
    .line 19
    const/16 v0, 0x8

    .line 20
    .line 21
    sput v0, Lcom/yuanqi/master/tools/w0;->c:I

    .line 22
    .line 23
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    sget-object v0, Lcom/yuanqi/master/tools/w0;->b:Lcom/tencent/mmkv/MMKV;

    invoke-virtual {v0}, Lcom/tencent/mmkv/MMKV;->clearAll()V

    return-void
.end method

.method public final b(Ljava/lang/String;)Z
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/yuanqi/master/tools/w0;->b:Lcom/tencent/mmkv/MMKV;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/tencent/mmkv/MMKV;->contains(Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
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
.end method

.method public final c(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "TT;)TT;"
        }
    .end annotation

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p2, Ljava/lang/Integer;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    sget-object v0, Lcom/yuanqi/master/tools/w0;->b:Lcom/tencent/mmkv/MMKV;

    .line 11
    .line 12
    check-cast p2, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    invoke-virtual {v0, p1, p2}, Lcom/tencent/mmkv/MMKV;->decodeInt(Ljava/lang/String;I)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    instance-of v0, p2, Ljava/lang/Long;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    sget-object v0, Lcom/yuanqi/master/tools/w0;->b:Lcom/tencent/mmkv/MMKV;

    .line 32
    .line 33
    check-cast p2, Ljava/lang/Number;

    .line 34
    .line 35
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 36
    .line 37
    .line 38
    move-result-wide v1

    .line 39
    invoke-virtual {v0, p1, v1, v2}, Lcom/tencent/mmkv/MMKV;->decodeLong(Ljava/lang/String;J)J

    .line 40
    .line 41
    .line 42
    move-result-wide p1

    .line 43
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    instance-of v0, p2, Ljava/lang/Float;

    .line 49
    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    sget-object v0, Lcom/yuanqi/master/tools/w0;->b:Lcom/tencent/mmkv/MMKV;

    .line 53
    .line 54
    check-cast p2, Ljava/lang/Number;

    .line 55
    .line 56
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    invoke-virtual {v0, p1, p2}, Lcom/tencent/mmkv/MMKV;->decodeFloat(Ljava/lang/String;F)F

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    goto :goto_0

    .line 69
    :cond_2
    instance-of v0, p2, Ljava/lang/Double;

    .line 70
    .line 71
    if-eqz v0, :cond_3

    .line 72
    .line 73
    sget-object v0, Lcom/yuanqi/master/tools/w0;->b:Lcom/tencent/mmkv/MMKV;

    .line 74
    .line 75
    check-cast p2, Ljava/lang/Number;

    .line 76
    .line 77
    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    .line 78
    .line 79
    .line 80
    move-result-wide v1

    .line 81
    invoke-virtual {v0, p1, v1, v2}, Lcom/tencent/mmkv/MMKV;->decodeDouble(Ljava/lang/String;D)D

    .line 82
    .line 83
    .line 84
    move-result-wide p1

    .line 85
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    goto :goto_0

    .line 90
    :cond_3
    instance-of v0, p2, Ljava/lang/Boolean;

    .line 91
    .line 92
    if-eqz v0, :cond_4

    .line 93
    .line 94
    sget-object v0, Lcom/yuanqi/master/tools/w0;->b:Lcom/tencent/mmkv/MMKV;

    .line 95
    .line 96
    check-cast p2, Ljava/lang/Boolean;

    .line 97
    .line 98
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    invoke-virtual {v0, p1, p2}, Lcom/tencent/mmkv/MMKV;->decodeBool(Ljava/lang/String;Z)Z

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    goto :goto_0

    .line 111
    :cond_4
    instance-of v0, p2, Ljava/lang/String;

    .line 112
    .line 113
    if-eqz v0, :cond_5

    .line 114
    .line 115
    sget-object v0, Lcom/yuanqi/master/tools/w0;->b:Lcom/tencent/mmkv/MMKV;

    .line 116
    .line 117
    check-cast p2, Ljava/lang/String;

    .line 118
    .line 119
    invoke-virtual {v0, p1, p2}, Lcom/tencent/mmkv/MMKV;->decodeString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    :cond_5
    :goto_0
    return-object p2
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
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
.end method

.method public final d(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "TT;)V"
        }
    .end annotation

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p2, Ljava/lang/Integer;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    sget-object v0, Lcom/yuanqi/master/tools/w0;->b:Lcom/tencent/mmkv/MMKV;

    .line 11
    .line 12
    check-cast p2, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    invoke-virtual {v0, p1, p2}, Lcom/tencent/mmkv/MMKV;->encode(Ljava/lang/String;I)Z

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    instance-of v0, p2, Ljava/lang/Long;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    sget-object v0, Lcom/yuanqi/master/tools/w0;->b:Lcom/tencent/mmkv/MMKV;

    .line 27
    .line 28
    check-cast p2, Ljava/lang/Number;

    .line 29
    .line 30
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 31
    .line 32
    .line 33
    move-result-wide v1

    .line 34
    invoke-virtual {v0, p1, v1, v2}, Lcom/tencent/mmkv/MMKV;->encode(Ljava/lang/String;J)Z

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    instance-of v0, p2, Ljava/lang/Float;

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    sget-object v0, Lcom/yuanqi/master/tools/w0;->b:Lcom/tencent/mmkv/MMKV;

    .line 43
    .line 44
    check-cast p2, Ljava/lang/Number;

    .line 45
    .line 46
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    invoke-virtual {v0, p1, p2}, Lcom/tencent/mmkv/MMKV;->encode(Ljava/lang/String;F)Z

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    instance-of v0, p2, Ljava/lang/Double;

    .line 55
    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    sget-object v0, Lcom/yuanqi/master/tools/w0;->b:Lcom/tencent/mmkv/MMKV;

    .line 59
    .line 60
    check-cast p2, Ljava/lang/Number;

    .line 61
    .line 62
    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    .line 63
    .line 64
    .line 65
    move-result-wide v1

    .line 66
    invoke-virtual {v0, p1, v1, v2}, Lcom/tencent/mmkv/MMKV;->encode(Ljava/lang/String;D)Z

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_3
    instance-of v0, p2, Ljava/lang/Boolean;

    .line 71
    .line 72
    if-eqz v0, :cond_4

    .line 73
    .line 74
    sget-object v0, Lcom/yuanqi/master/tools/w0;->b:Lcom/tencent/mmkv/MMKV;

    .line 75
    .line 76
    check-cast p2, Ljava/lang/Boolean;

    .line 77
    .line 78
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    invoke-virtual {v0, p1, p2}, Lcom/tencent/mmkv/MMKV;->encode(Ljava/lang/String;Z)Z

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_4
    instance-of v0, p2, Ljava/lang/String;

    .line 87
    .line 88
    if-eqz v0, :cond_5

    .line 89
    .line 90
    sget-object v0, Lcom/yuanqi/master/tools/w0;->b:Lcom/tencent/mmkv/MMKV;

    .line 91
    .line 92
    check-cast p2, Ljava/lang/String;

    .line 93
    .line 94
    invoke-virtual {v0, p1, p2}, Lcom/tencent/mmkv/MMKV;->encode(Ljava/lang/String;Ljava/lang/String;)Z

    .line 95
    .line 96
    .line 97
    :cond_5
    :goto_0
    return-void
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
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
.end method

.method public final e()Lcom/tencent/mmkv/MMKV;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Lcom/yuanqi/master/tools/w0;->b:Lcom/tencent/mmkv/MMKV;

    return-object v0
.end method

.method public final f(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/yuanqi/master/tools/w0;->b:Lcom/tencent/mmkv/MMKV;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/tencent/mmkv/MMKV;->removeValueForKey(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
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
.end method

.method public final g([Ljava/lang/String;)V
    .locals 1
    .param p1    # [Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "keys"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/yuanqi/master/tools/w0;->b:Lcom/tencent/mmkv/MMKV;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/tencent/mmkv/MMKV;->removeValuesForKeys([Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
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
.end method
