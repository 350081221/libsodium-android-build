.class public final Lio/github/aakira/napier/c;
.super Lio/github/aakira/napier/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/github/aakira/napier/c$a;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\r\u0018\u0000 \u00192\u00020\u0001:\u0001\u0013B\u0011\u0012\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000c\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002J.\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0008\u001a\u00020\u00052\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010\n\u001a\u0004\u0018\u00010\t2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0014J\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u001c\u0010\u0015\u001a\n \u0012*\u0004\u0018\u00010\u00110\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u00020\u0002*\u00020\t8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001e"
    }
    d2 = {
        "Lio/github/aakira/napier/c;",
        "Lio/github/aakira/napier/a;",
        "",
        "tag",
        "g",
        "Lio/github/aakira/napier/e$a;",
        "",
        "h",
        "priority",
        "",
        "throwable",
        "message",
        "Lkotlin/r2;",
        "c",
        "className",
        "e",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "Ljava/util/regex/Pattern;",
        "kotlin.jvm.PlatformType",
        "a",
        "Ljava/util/regex/Pattern;",
        "anonymousClass",
        "b",
        "Ljava/lang/String;",
        "defaultTag",
        "f",
        "(Ljava/lang/Throwable;)Ljava/lang/String;",
        "stackTraceString",
        "<init>",
        "(Ljava/lang/String;)V",
        "napier_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x2
    }
.end annotation


# static fields
.field private static final c:I = 0xfa0

.field private static final d:I = 0x17

.field private static final e:I = 0x9

.field public static final f:Lio/github/aakira/napier/c$a;
    .annotation build Lp4/l;
    .end annotation
.end field


# instance fields
.field private final a:Ljava/util/regex/Pattern;

.field private final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/github/aakira/napier/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/github/aakira/napier/c$a;-><init>(Lkotlin/jvm/internal/w;)V

    sput-object v0, Lio/github/aakira/napier/c;->f:Lio/github/aakira/napier/c$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lio/github/aakira/napier/c;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/w;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param

    const-string v0, "defaultTag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Lio/github/aakira/napier/a;-><init>()V

    iput-object p1, p0, Lio/github/aakira/napier/c;->b:Ljava/lang/String;

    const-string p1, "(\\$\\d+)+$"

    .line 2
    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p1

    iput-object p1, p0, Lio/github/aakira/napier/c;->a:Ljava/util/regex/Pattern;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILkotlin/jvm/internal/w;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const-string p1, "app"

    .line 3
    :cond_0
    invoke-direct {p0, p1}, Lio/github/aakira/napier/c;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method private final f(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/io/StringWriter;

    .line 2
    .line 3
    const/16 v1, 0x100

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/io/StringWriter;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Ljava/io/PrintWriter;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, v0, v2}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;Z)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v1}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/io/PrintWriter;->flush()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const-string v0, "sw.toString()"

    .line 25
    .line 26
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-object p1
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
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method

.method private final g(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "Thread.currentThread()"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    array-length v1, v0

    .line 17
    const/16 v2, 0x9

    .line 18
    .line 19
    if-lt v1, v2, :cond_0

    .line 20
    .line 21
    aget-object p1, v0, v2

    .line 22
    .line 23
    new-instance v0, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const-string v2, "className"

    .line 33
    .line 34
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v1}, Lio/github/aakira/napier/c;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const/16 v1, 0x24

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    :cond_0
    return-object p1
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
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method

.method private final h(Lio/github/aakira/napier/e$a;)I
    .locals 1

    .line 1
    sget-object v0, Lio/github/aakira/napier/d;->a:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    aget p1, v0, p1

    .line 8
    .line 9
    packed-switch p1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance p1, Lkotlin/j0;

    .line 13
    .line 14
    invoke-direct {p1}, Lkotlin/j0;-><init>()V

    .line 15
    .line 16
    .line 17
    throw p1

    .line 18
    :pswitch_0
    const/4 p1, 0x7

    .line 19
    goto :goto_0

    .line 20
    :pswitch_1
    const/4 p1, 0x6

    .line 21
    goto :goto_0

    .line 22
    :pswitch_2
    const/4 p1, 0x5

    .line 23
    goto :goto_0

    .line 24
    :pswitch_3
    const/4 p1, 0x4

    .line 25
    goto :goto_0

    .line 26
    :pswitch_4
    const/4 p1, 0x3

    .line 27
    goto :goto_0

    .line 28
    :pswitch_5
    const/4 p1, 0x2

    .line 29
    :goto_0
    return p1

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method


# virtual methods
.method protected c(Lio/github/aakira/napier/e$a;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 7
    .param p1    # Lio/github/aakira/napier/e$a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Throwable;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 1
    const-string v0, "priority"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget-object p2, p0, Lio/github/aakira/napier/c;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {p0, p2}, Lio/github/aakira/napier/c;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    :goto_0
    if-eqz p4, :cond_1

    .line 16
    .line 17
    if-eqz p3, :cond_2

    .line 18
    .line 19
    new-instance v0, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const/16 p4, 0xa

    .line 28
    .line 29
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-direct {p0, p3}, Lio/github/aakira/napier/c;->f(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p3

    .line 36
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p4

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    if-eqz p3, :cond_8

    .line 45
    .line 46
    invoke-direct {p0, p3}, Lio/github/aakira/napier/c;->f(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p4

    .line 50
    if-eqz p4, :cond_8

    .line 51
    .line 52
    :cond_2
    :goto_1
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    .line 53
    .line 54
    .line 55
    move-result p3

    .line 56
    const/16 v0, 0xfa0

    .line 57
    .line 58
    if-gt p3, v0, :cond_4

    .line 59
    .line 60
    sget-object p3, Lio/github/aakira/napier/e$a;->ASSERT:Lio/github/aakira/napier/e$a;

    .line 61
    .line 62
    if-ne p1, p3, :cond_3

    .line 63
    .line 64
    invoke-static {p2, p4}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_3
    invoke-direct {p0, p1}, Lio/github/aakira/napier/c;->h(Lio/github/aakira/napier/e$a;)I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    invoke-static {p1, p2, p4}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    :goto_2
    return-void

    .line 76
    :cond_4
    const/4 v0, 0x0

    .line 77
    move v6, v0

    .line 78
    :goto_3
    if-ge v6, p3, :cond_8

    .line 79
    .line 80
    const/16 v1, 0xa

    .line 81
    .line 82
    const/4 v3, 0x0

    .line 83
    const/4 v4, 0x4

    .line 84
    const/4 v5, 0x0

    .line 85
    move-object v0, p4

    .line 86
    move v2, v6

    .line 87
    invoke-static/range {v0 .. v5}, Lkotlin/text/v;->o3(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    const/4 v1, -0x1

    .line 92
    if-eq v0, v1, :cond_5

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_5
    move v0, p3

    .line 96
    :goto_4
    add-int/lit16 v1, v6, 0xfa0

    .line 97
    .line 98
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    invoke-virtual {p4, v6, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    const-string v3, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"

    .line 107
    .line 108
    invoke-static {v2, v3}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-direct {p0, p1}, Lio/github/aakira/napier/c;->h(Lio/github/aakira/napier/e$a;)I

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    const/4 v4, 0x7

    .line 116
    if-ne v3, v4, :cond_6

    .line 117
    .line 118
    invoke-static {p2, v2}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    .line 119
    .line 120
    .line 121
    goto :goto_5

    .line 122
    :cond_6
    invoke-direct {p0, p1}, Lio/github/aakira/napier/c;->h(Lio/github/aakira/napier/e$a;)I

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    invoke-static {v3, p2, v2}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    .line 127
    .line 128
    .line 129
    :goto_5
    if-lt v1, v0, :cond_7

    .line 130
    .line 131
    add-int/lit8 v6, v1, 0x1

    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_7
    move v6, v1

    .line 135
    goto :goto_4

    .line 136
    :cond_8
    return-void
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
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
.end method

.method public final e(Ljava/lang/String;)Ljava/lang/String;
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    const-string v0, "className"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lio/github/aakira/napier/c;->a:Ljava/util/regex/Pattern;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    const-string p1, ""

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const-string v0, "m.replaceAll(\"\")"

    .line 25
    .line 26
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    const/16 v2, 0x2e

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x6

    .line 34
    const/4 v6, 0x0

    .line 35
    move-object v1, p1

    .line 36
    invoke-static/range {v1 .. v6}, Lkotlin/text/v;->C3(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    add-int/lit8 v0, v0, 0x1

    .line 41
    .line 42
    if-eqz p1, :cond_1

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    const-string v0, "(this as java.lang.String).substring(startIndex)"

    .line 49
    .line 50
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 54
    .line 55
    .line 56
    return-object p1

    .line 57
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    .line 58
    .line 59
    const-string v0, "null cannot be cast to non-null type java.lang.String"

    .line 60
    .line 61
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p1
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
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method
