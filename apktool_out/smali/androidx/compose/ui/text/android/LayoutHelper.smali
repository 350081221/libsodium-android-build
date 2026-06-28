.class public final Landroidx/compose/ui/text/android/LayoutHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/text/android/LayoutHelper$BidiRun;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0018\n\u0002\u0008\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0019\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0010\u000c\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001:\u0001*B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0015\u001a\u00020\rJ\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u001e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aJ\u000e\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\rJ\u0010\u0010 \u001a\u00020\r2\u0008\u0008\u0001\u0010\u0015\u001a\u00020\rJ\u001a\u0010!\u001a\u00020\r2\u0008\u0008\u0001\u0010\u0018\u001a\u00020\r2\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u001aJ\u0010\u0010\"\u001a\u00020\r2\u0008\u0008\u0001\u0010\u0015\u001a\u00020\rJ\u000e\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020%J\u0010\u0010&\u001a\u00020\u001a2\u0008\u0008\u0001\u0010\u0015\u001a\u00020\rJ\u0018\u0010\'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\r2\u0006\u0010)\u001a\u00020\rH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\r0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"
    }
    d2 = {
        "Landroidx/compose/ui/text/android/LayoutHelper;",
        "",
        "layout",
        "Landroid/text/Layout;",
        "(Landroid/text/Layout;)V",
        "bidiProcessedParagraphs",
        "",
        "getLayout",
        "()Landroid/text/Layout;",
        "paragraphBidi",
        "",
        "Ljava/text/Bidi;",
        "paragraphCount",
        "",
        "getParagraphCount",
        "()I",
        "paragraphEnds",
        "",
        "tmpBuffer",
        "",
        "analyzeBidi",
        "paragraphIndex",
        "getDownstreamHorizontal",
        "",
        "offset",
        "primary",
        "",
        "getHorizontalPosition",
        "usePrimaryDirection",
        "upstream",
        "getLineVisibleEnd",
        "lineIndex",
        "getParagraphEnd",
        "getParagraphForOffset",
        "getParagraphStart",
        "isLineEndSpace",
        "c",
        "",
        "isRtlParagraph",
        "lineEndToVisibleEnd",
        "lineEnd",
        "lineStart",
        "BidiRun",
        "ui-text_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nLayoutHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutHelper.kt\nandroidx/compose/ui/text/android/LayoutHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,401:1\n1#2:402\n1627#3,6:403\n1627#3,6:409\n*S KotlinDebug\n*F\n+ 1 LayoutHelper.kt\nandroidx/compose/ui/text/android/LayoutHelper\n*L\n281#1:403,6\n320#1:409,6\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final bidiProcessedParagraphs:[Z
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final layout:Landroid/text/Layout;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final paragraphBidi:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/text/Bidi;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final paragraphCount:I

.field private final paragraphEnds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private tmpBuffer:[C
    .annotation build Lp4/m;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/text/Layout;)V
    .locals 7
    .param p1    # Landroid/text/Layout;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/text/android/LayoutHelper;->layout:Landroid/text/Layout;

    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    move v3, v0

    .line 13
    :cond_0
    iget-object v1, p0, Landroidx/compose/ui/text/android/LayoutHelper;->layout:Landroid/text/Layout;

    .line 14
    .line 15
    invoke-virtual {v1}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/16 v2, 0xa

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    const/4 v5, 0x4

    .line 23
    const/4 v6, 0x0

    .line 24
    invoke-static/range {v1 .. v6}, Lkotlin/text/v;->o3(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-gez v1, :cond_1

    .line 29
    .line 30
    iget-object v1, p0, Landroidx/compose/ui/text/android/LayoutHelper;->layout:Landroid/text/Layout;

    .line 31
    .line 32
    invoke-virtual {v1}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    :goto_0
    move v3, v1

    .line 44
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Landroidx/compose/ui/text/android/LayoutHelper;->layout:Landroid/text/Layout;

    .line 52
    .line 53
    invoke-virtual {v1}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-lt v3, v1, :cond_0

    .line 62
    .line 63
    iput-object p1, p0, Landroidx/compose/ui/text/android/LayoutHelper;->paragraphEnds:Ljava/util/List;

    .line 64
    .line 65
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    new-instance v1, Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 72
    .line 73
    .line 74
    :goto_1
    if-ge v0, p1, :cond_2

    .line 75
    .line 76
    const/4 v2, 0x0

    .line 77
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    add-int/lit8 v0, v0, 0x1

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    iput-object v1, p0, Landroidx/compose/ui/text/android/LayoutHelper;->paragraphBidi:Ljava/util/List;

    .line 84
    .line 85
    iget-object p1, p0, Landroidx/compose/ui/text/android/LayoutHelper;->paragraphEnds:Ljava/util/List;

    .line 86
    .line 87
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    new-array p1, p1, [Z

    .line 92
    .line 93
    iput-object p1, p0, Landroidx/compose/ui/text/android/LayoutHelper;->bidiProcessedParagraphs:[Z

    .line 94
    .line 95
    iget-object p1, p0, Landroidx/compose/ui/text/android/LayoutHelper;->paragraphEnds:Ljava/util/List;

    .line 96
    .line 97
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    iput p1, p0, Landroidx/compose/ui/text/android/LayoutHelper;->paragraphCount:I

    .line 102
    .line 103
    return-void
    .line 104
    .line 105
    .line 106
.end method

.method private final getDownstreamHorizontal(IZ)F
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/android/LayoutHelper;->layout:Landroid/text/Layout;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineForOffset(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Landroidx/compose/ui/text/android/LayoutHelper;->layout:Landroid/text/Layout;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Landroid/text/Layout;->getLineEnd(I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {p1, v0}, Lkotlin/ranges/s;->B(II)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    iget-object p2, p0, Landroidx/compose/ui/text/android/LayoutHelper;->layout:Landroid/text/Layout;

    .line 20
    .line 21
    invoke-virtual {p2, p1}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object p2, p0, Landroidx/compose/ui/text/android/LayoutHelper;->layout:Landroid/text/Layout;

    .line 27
    .line 28
    invoke-virtual {p2, p1}, Landroid/text/Layout;->getSecondaryHorizontal(I)F

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    :goto_0
    return p1
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
.end method

.method public static synthetic getParagraphForOffset$default(Landroidx/compose/ui/text/android/LayoutHelper;IZILjava/lang/Object;)I
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/text/android/LayoutHelper;->getParagraphForOffset(IZ)I

    move-result p0

    return p0
.end method

.method private final lineEndToVisibleEnd(II)I
    .locals 2

    :goto_0
    if-le p1, p2, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/text/android/LayoutHelper;->layout:Landroid/text/Layout;

    invoke-virtual {v0}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    add-int/lit8 v1, p1, -0x1

    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/compose/ui/text/android/LayoutHelper;->isLineEndSpace(C)Z

    move-result v0

    if-eqz v0, :cond_0

    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_0
    return p1
.end method


# virtual methods
.method public final analyzeBidi(I)Ljava/text/Bidi;
    .locals 11
    .annotation build Lp4/m;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/android/LayoutHelper;->bidiProcessedParagraphs:[Z

    .line 2
    .line 3
    aget-boolean v0, v0, p1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/compose/ui/text/android/LayoutHelper;->paragraphBidi:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Ljava/text/Bidi;

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    move v1, v0

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    iget-object v1, p0, Landroidx/compose/ui/text/android/LayoutHelper;->paragraphEnds:Ljava/util/List;

    .line 22
    .line 23
    add-int/lit8 v2, p1, -0x1

    .line 24
    .line 25
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Ljava/lang/Number;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    :goto_0
    iget-object v2, p0, Landroidx/compose/ui/text/android/LayoutHelper;->paragraphEnds:Ljava/util/List;

    .line 36
    .line 37
    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Ljava/lang/Number;

    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    sub-int v8, v2, v1

    .line 48
    .line 49
    iget-object v3, p0, Landroidx/compose/ui/text/android/LayoutHelper;->tmpBuffer:[C

    .line 50
    .line 51
    if-eqz v3, :cond_2

    .line 52
    .line 53
    array-length v4, v3

    .line 54
    if-ge v4, v8, :cond_3

    .line 55
    .line 56
    :cond_2
    new-array v3, v8, [C

    .line 57
    .line 58
    :cond_3
    move-object v10, v3

    .line 59
    iget-object v3, p0, Landroidx/compose/ui/text/android/LayoutHelper;->layout:Landroid/text/Layout;

    .line 60
    .line 61
    invoke-virtual {v3}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-static {v3, v1, v2, v10, v0}, Landroid/text/TextUtils;->getChars(Ljava/lang/CharSequence;II[CI)V

    .line 66
    .line 67
    .line 68
    invoke-static {v10, v0, v8}, Ljava/text/Bidi;->requiresBidi([CII)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    const/4 v1, 0x0

    .line 73
    const/4 v2, 0x1

    .line 74
    if-eqz v0, :cond_4

    .line 75
    .line 76
    invoke-virtual {p0, p1}, Landroidx/compose/ui/text/android/LayoutHelper;->isRtlParagraph(I)Z

    .line 77
    .line 78
    .line 79
    move-result v9

    .line 80
    new-instance v0, Ljava/text/Bidi;

    .line 81
    .line 82
    const/4 v5, 0x0

    .line 83
    const/4 v6, 0x0

    .line 84
    const/4 v7, 0x0

    .line 85
    move-object v3, v0

    .line 86
    move-object v4, v10

    .line 87
    invoke-direct/range {v3 .. v9}, Ljava/text/Bidi;-><init>([CI[BIII)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/text/Bidi;->getRunCount()I

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-ne v3, v2, :cond_5

    .line 95
    .line 96
    :cond_4
    move-object v0, v1

    .line 97
    :cond_5
    iget-object v3, p0, Landroidx/compose/ui/text/android/LayoutHelper;->paragraphBidi:Ljava/util/List;

    .line 98
    .line 99
    invoke-interface {v3, p1, v0}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    iget-object v3, p0, Landroidx/compose/ui/text/android/LayoutHelper;->bidiProcessedParagraphs:[Z

    .line 103
    .line 104
    aput-boolean v2, v3, p1

    .line 105
    .line 106
    if-eqz v0, :cond_7

    .line 107
    .line 108
    iget-object p1, p0, Landroidx/compose/ui/text/android/LayoutHelper;->tmpBuffer:[C

    .line 109
    .line 110
    if-ne v10, p1, :cond_6

    .line 111
    .line 112
    move-object v10, v1

    .line 113
    goto :goto_1

    .line 114
    :cond_6
    move-object v10, p1

    .line 115
    :cond_7
    :goto_1
    iput-object v10, p0, Landroidx/compose/ui/text/android/LayoutHelper;->tmpBuffer:[C

    .line 116
    .line 117
    return-object v0
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
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
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
.end method

.method public final getHorizontalPosition(IZZ)F
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    invoke-direct/range {p0 .. p2}, Landroidx/compose/ui/text/android/LayoutHelper;->getDownstreamHorizontal(IZ)F

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    return v1

    .line 14
    :cond_0
    iget-object v3, v0, Landroidx/compose/ui/text/android/LayoutHelper;->layout:Landroid/text/Layout;

    .line 15
    .line 16
    invoke-static {v3, v1, v2}, Landroidx/compose/ui/text/android/LayoutCompatKt;->getLineForOffset(Landroid/text/Layout;IZ)I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    iget-object v4, v0, Landroidx/compose/ui/text/android/LayoutHelper;->layout:Landroid/text/Layout;

    .line 21
    .line 22
    invoke-virtual {v4, v3}, Landroid/text/Layout;->getLineStart(I)I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    iget-object v5, v0, Landroidx/compose/ui/text/android/LayoutHelper;->layout:Landroid/text/Layout;

    .line 27
    .line 28
    invoke-virtual {v5, v3}, Landroid/text/Layout;->getLineEnd(I)I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-eq v1, v4, :cond_1

    .line 33
    .line 34
    if-eq v1, v5, :cond_1

    .line 35
    .line 36
    invoke-direct/range {p0 .. p2}, Landroidx/compose/ui/text/android/LayoutHelper;->getDownstreamHorizontal(IZ)F

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    return v1

    .line 41
    :cond_1
    if-eqz v1, :cond_23

    .line 42
    .line 43
    iget-object v6, v0, Landroidx/compose/ui/text/android/LayoutHelper;->layout:Landroid/text/Layout;

    .line 44
    .line 45
    invoke-virtual {v6}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    if-ne v1, v6, :cond_2

    .line 54
    .line 55
    goto/16 :goto_10

    .line 56
    .line 57
    :cond_2
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/text/android/LayoutHelper;->getParagraphForOffset(IZ)I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    invoke-virtual {v0, v2}, Landroidx/compose/ui/text/android/LayoutHelper;->isRtlParagraph(I)Z

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    invoke-direct {v0, v5, v4}, Landroidx/compose/ui/text/android/LayoutHelper;->lineEndToVisibleEnd(II)I

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    invoke-virtual {v0, v2}, Landroidx/compose/ui/text/android/LayoutHelper;->getParagraphStart(I)I

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    sub-int v8, v4, v7

    .line 74
    .line 75
    sub-int v7, v5, v7

    .line 76
    .line 77
    invoke-virtual {v0, v2}, Landroidx/compose/ui/text/android/LayoutHelper;->analyzeBidi(I)Ljava/text/Bidi;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    if-eqz v2, :cond_3

    .line 82
    .line 83
    invoke-virtual {v2, v8, v7}, Ljava/text/Bidi;->createLineBidi(II)Ljava/text/Bidi;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    goto :goto_0

    .line 88
    :cond_3
    const/4 v2, 0x0

    .line 89
    :goto_0
    const/4 v7, 0x0

    .line 90
    const/4 v8, 0x1

    .line 91
    if-eqz v2, :cond_1c

    .line 92
    .line 93
    invoke-virtual {v2}, Ljava/text/Bidi;->getRunCount()I

    .line 94
    .line 95
    .line 96
    move-result v9

    .line 97
    if-ne v9, v8, :cond_4

    .line 98
    .line 99
    goto/16 :goto_c

    .line 100
    .line 101
    :cond_4
    invoke-virtual {v2}, Ljava/text/Bidi;->getRunCount()I

    .line 102
    .line 103
    .line 104
    move-result v9

    .line 105
    new-array v10, v9, [Landroidx/compose/ui/text/android/LayoutHelper$BidiRun;

    .line 106
    .line 107
    move v11, v7

    .line 108
    :goto_1
    if-ge v11, v9, :cond_6

    .line 109
    .line 110
    new-instance v12, Landroidx/compose/ui/text/android/LayoutHelper$BidiRun;

    .line 111
    .line 112
    invoke-virtual {v2, v11}, Ljava/text/Bidi;->getRunStart(I)I

    .line 113
    .line 114
    .line 115
    move-result v13

    .line 116
    add-int/2addr v13, v4

    .line 117
    invoke-virtual {v2, v11}, Ljava/text/Bidi;->getRunLimit(I)I

    .line 118
    .line 119
    .line 120
    move-result v14

    .line 121
    add-int/2addr v14, v4

    .line 122
    invoke-virtual {v2, v11}, Ljava/text/Bidi;->getRunLevel(I)I

    .line 123
    .line 124
    .line 125
    move-result v15

    .line 126
    rem-int/lit8 v15, v15, 0x2

    .line 127
    .line 128
    if-ne v15, v8, :cond_5

    .line 129
    .line 130
    move v15, v8

    .line 131
    goto :goto_2

    .line 132
    :cond_5
    move v15, v7

    .line 133
    :goto_2
    invoke-direct {v12, v13, v14, v15}, Landroidx/compose/ui/text/android/LayoutHelper$BidiRun;-><init>(IIZ)V

    .line 134
    .line 135
    .line 136
    aput-object v12, v10, v11

    .line 137
    .line 138
    add-int/lit8 v11, v11, 0x1

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_6
    invoke-virtual {v2}, Ljava/text/Bidi;->getRunCount()I

    .line 142
    .line 143
    .line 144
    move-result v11

    .line 145
    new-array v12, v11, [B

    .line 146
    .line 147
    move v13, v7

    .line 148
    :goto_3
    if-ge v13, v11, :cond_7

    .line 149
    .line 150
    invoke-virtual {v2, v13}, Ljava/text/Bidi;->getRunLevel(I)I

    .line 151
    .line 152
    .line 153
    move-result v14

    .line 154
    int-to-byte v14, v14

    .line 155
    aput-byte v14, v12, v13

    .line 156
    .line 157
    add-int/lit8 v13, v13, 0x1

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_7
    invoke-static {v12, v7, v10, v7, v9}, Ljava/text/Bidi;->reorderVisually([BI[Ljava/lang/Object;II)V

    .line 161
    .line 162
    .line 163
    const/4 v2, -0x1

    .line 164
    if-ne v1, v4, :cond_11

    .line 165
    .line 166
    move v4, v7

    .line 167
    :goto_4
    if-ge v4, v9, :cond_a

    .line 168
    .line 169
    aget-object v5, v10, v4

    .line 170
    .line 171
    invoke-virtual {v5}, Landroidx/compose/ui/text/android/LayoutHelper$BidiRun;->getStart()I

    .line 172
    .line 173
    .line 174
    move-result v5

    .line 175
    if-ne v5, v1, :cond_8

    .line 176
    .line 177
    move v5, v8

    .line 178
    goto :goto_5

    .line 179
    :cond_8
    move v5, v7

    .line 180
    :goto_5
    if-eqz v5, :cond_9

    .line 181
    .line 182
    move v2, v4

    .line 183
    goto :goto_6

    .line 184
    :cond_9
    add-int/lit8 v4, v4, 0x1

    .line 185
    .line 186
    goto :goto_4

    .line 187
    :cond_a
    :goto_6
    aget-object v1, v10, v2

    .line 188
    .line 189
    if-nez p2, :cond_b

    .line 190
    .line 191
    invoke-virtual {v1}, Landroidx/compose/ui/text/android/LayoutHelper$BidiRun;->isRtl()Z

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    if-ne v6, v1, :cond_d

    .line 196
    .line 197
    :cond_b
    if-nez v6, :cond_c

    .line 198
    .line 199
    move v6, v8

    .line 200
    goto :goto_7

    .line 201
    :cond_c
    move v6, v7

    .line 202
    :cond_d
    :goto_7
    if-nez v2, :cond_e

    .line 203
    .line 204
    if-eqz v6, :cond_e

    .line 205
    .line 206
    iget-object v1, v0, Landroidx/compose/ui/text/android/LayoutHelper;->layout:Landroid/text/Layout;

    .line 207
    .line 208
    invoke-virtual {v1, v3}, Landroid/text/Layout;->getLineLeft(I)F

    .line 209
    .line 210
    .line 211
    move-result v1

    .line 212
    return v1

    .line 213
    :cond_e
    invoke-static {v10}, Lkotlin/collections/l;->we([Ljava/lang/Object;)I

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    if-ne v2, v1, :cond_f

    .line 218
    .line 219
    if-nez v6, :cond_f

    .line 220
    .line 221
    iget-object v1, v0, Landroidx/compose/ui/text/android/LayoutHelper;->layout:Landroid/text/Layout;

    .line 222
    .line 223
    invoke-virtual {v1, v3}, Landroid/text/Layout;->getLineRight(I)F

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    return v1

    .line 228
    :cond_f
    if-eqz v6, :cond_10

    .line 229
    .line 230
    iget-object v1, v0, Landroidx/compose/ui/text/android/LayoutHelper;->layout:Landroid/text/Layout;

    .line 231
    .line 232
    sub-int/2addr v2, v8

    .line 233
    aget-object v2, v10, v2

    .line 234
    .line 235
    invoke-virtual {v2}, Landroidx/compose/ui/text/android/LayoutHelper$BidiRun;->getStart()I

    .line 236
    .line 237
    .line 238
    move-result v2

    .line 239
    invoke-virtual {v1, v2}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    return v1

    .line 244
    :cond_10
    iget-object v1, v0, Landroidx/compose/ui/text/android/LayoutHelper;->layout:Landroid/text/Layout;

    .line 245
    .line 246
    add-int/2addr v2, v8

    .line 247
    aget-object v2, v10, v2

    .line 248
    .line 249
    invoke-virtual {v2}, Landroidx/compose/ui/text/android/LayoutHelper$BidiRun;->getStart()I

    .line 250
    .line 251
    .line 252
    move-result v2

    .line 253
    invoke-virtual {v1, v2}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    .line 254
    .line 255
    .line 256
    move-result v1

    .line 257
    return v1

    .line 258
    :cond_11
    if-le v1, v5, :cond_12

    .line 259
    .line 260
    invoke-direct {v0, v1, v4}, Landroidx/compose/ui/text/android/LayoutHelper;->lineEndToVisibleEnd(II)I

    .line 261
    .line 262
    .line 263
    move-result v1

    .line 264
    :cond_12
    move v4, v7

    .line 265
    :goto_8
    if-ge v4, v9, :cond_15

    .line 266
    .line 267
    aget-object v5, v10, v4

    .line 268
    .line 269
    invoke-virtual {v5}, Landroidx/compose/ui/text/android/LayoutHelper$BidiRun;->getEnd()I

    .line 270
    .line 271
    .line 272
    move-result v5

    .line 273
    if-ne v5, v1, :cond_13

    .line 274
    .line 275
    move v5, v8

    .line 276
    goto :goto_9

    .line 277
    :cond_13
    move v5, v7

    .line 278
    :goto_9
    if-eqz v5, :cond_14

    .line 279
    .line 280
    move v2, v4

    .line 281
    goto :goto_a

    .line 282
    :cond_14
    add-int/lit8 v4, v4, 0x1

    .line 283
    .line 284
    goto :goto_8

    .line 285
    :cond_15
    :goto_a
    aget-object v1, v10, v2

    .line 286
    .line 287
    if-nez p2, :cond_18

    .line 288
    .line 289
    invoke-virtual {v1}, Landroidx/compose/ui/text/android/LayoutHelper$BidiRun;->isRtl()Z

    .line 290
    .line 291
    .line 292
    move-result v1

    .line 293
    if-ne v6, v1, :cond_16

    .line 294
    .line 295
    goto :goto_b

    .line 296
    :cond_16
    if-nez v6, :cond_17

    .line 297
    .line 298
    move v6, v8

    .line 299
    goto :goto_b

    .line 300
    :cond_17
    move v6, v7

    .line 301
    :cond_18
    :goto_b
    if-nez v2, :cond_19

    .line 302
    .line 303
    if-eqz v6, :cond_19

    .line 304
    .line 305
    iget-object v1, v0, Landroidx/compose/ui/text/android/LayoutHelper;->layout:Landroid/text/Layout;

    .line 306
    .line 307
    invoke-virtual {v1, v3}, Landroid/text/Layout;->getLineLeft(I)F

    .line 308
    .line 309
    .line 310
    move-result v1

    .line 311
    return v1

    .line 312
    :cond_19
    invoke-static {v10}, Lkotlin/collections/l;->we([Ljava/lang/Object;)I

    .line 313
    .line 314
    .line 315
    move-result v1

    .line 316
    if-ne v2, v1, :cond_1a

    .line 317
    .line 318
    if-nez v6, :cond_1a

    .line 319
    .line 320
    iget-object v1, v0, Landroidx/compose/ui/text/android/LayoutHelper;->layout:Landroid/text/Layout;

    .line 321
    .line 322
    invoke-virtual {v1, v3}, Landroid/text/Layout;->getLineRight(I)F

    .line 323
    .line 324
    .line 325
    move-result v1

    .line 326
    return v1

    .line 327
    :cond_1a
    if-eqz v6, :cond_1b

    .line 328
    .line 329
    iget-object v1, v0, Landroidx/compose/ui/text/android/LayoutHelper;->layout:Landroid/text/Layout;

    .line 330
    .line 331
    sub-int/2addr v2, v8

    .line 332
    aget-object v2, v10, v2

    .line 333
    .line 334
    invoke-virtual {v2}, Landroidx/compose/ui/text/android/LayoutHelper$BidiRun;->getEnd()I

    .line 335
    .line 336
    .line 337
    move-result v2

    .line 338
    invoke-virtual {v1, v2}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    .line 339
    .line 340
    .line 341
    move-result v1

    .line 342
    return v1

    .line 343
    :cond_1b
    iget-object v1, v0, Landroidx/compose/ui/text/android/LayoutHelper;->layout:Landroid/text/Layout;

    .line 344
    .line 345
    add-int/2addr v2, v8

    .line 346
    aget-object v2, v10, v2

    .line 347
    .line 348
    invoke-virtual {v2}, Landroidx/compose/ui/text/android/LayoutHelper$BidiRun;->getEnd()I

    .line 349
    .line 350
    .line 351
    move-result v2

    .line 352
    invoke-virtual {v1, v2}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    .line 353
    .line 354
    .line 355
    move-result v1

    .line 356
    return v1

    .line 357
    :cond_1c
    :goto_c
    iget-object v2, v0, Landroidx/compose/ui/text/android/LayoutHelper;->layout:Landroid/text/Layout;

    .line 358
    .line 359
    invoke-virtual {v2, v4}, Landroid/text/Layout;->isRtlCharAt(I)Z

    .line 360
    .line 361
    .line 362
    move-result v2

    .line 363
    if-nez p2, :cond_1d

    .line 364
    .line 365
    if-ne v6, v2, :cond_1f

    .line 366
    .line 367
    :cond_1d
    if-nez v6, :cond_1e

    .line 368
    .line 369
    move v6, v8

    .line 370
    goto :goto_d

    .line 371
    :cond_1e
    move v6, v7

    .line 372
    :cond_1f
    :goto_d
    if-ne v1, v4, :cond_20

    .line 373
    .line 374
    move v7, v6

    .line 375
    goto :goto_e

    .line 376
    :cond_20
    if-nez v6, :cond_21

    .line 377
    .line 378
    move v7, v8

    .line 379
    :cond_21
    :goto_e
    iget-object v1, v0, Landroidx/compose/ui/text/android/LayoutHelper;->layout:Landroid/text/Layout;

    .line 380
    .line 381
    if-eqz v7, :cond_22

    .line 382
    .line 383
    invoke-virtual {v1, v3}, Landroid/text/Layout;->getLineLeft(I)F

    .line 384
    .line 385
    .line 386
    move-result v1

    .line 387
    goto :goto_f

    .line 388
    :cond_22
    invoke-virtual {v1, v3}, Landroid/text/Layout;->getLineRight(I)F

    .line 389
    .line 390
    .line 391
    move-result v1

    .line 392
    :goto_f
    return v1

    .line 393
    :cond_23
    :goto_10
    invoke-direct/range {p0 .. p2}, Landroidx/compose/ui/text/android/LayoutHelper;->getDownstreamHorizontal(IZ)F

    .line 394
    .line 395
    .line 396
    move-result v1

    .line 397
    return v1
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
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
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
.end method

.method public final getLayout()Landroid/text/Layout;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/text/android/LayoutHelper;->layout:Landroid/text/Layout;

    return-object v0
.end method

.method public final getLineVisibleEnd(I)I
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/text/android/LayoutHelper;->layout:Landroid/text/Layout;

    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineEnd(I)I

    move-result v0

    iget-object v1, p0, Landroidx/compose/ui/text/android/LayoutHelper;->layout:Landroid/text/Layout;

    invoke-virtual {v1, p1}, Landroid/text/Layout;->getLineStart(I)I

    move-result p1

    invoke-direct {p0, v0, p1}, Landroidx/compose/ui/text/android/LayoutHelper;->lineEndToVisibleEnd(II)I

    move-result p1

    return p1
.end method

.method public final getParagraphCount()I
    .locals 1

    iget v0, p0, Landroidx/compose/ui/text/android/LayoutHelper;->paragraphCount:I

    return v0
.end method

.method public final getParagraphEnd(I)I
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/compose/ui/text/android/LayoutHelper;->paragraphEnds:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    return p1
.end method

.method public final getParagraphForOffset(IZ)I
    .locals 6
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/android/LayoutHelper;->paragraphEnds:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x6

    .line 10
    const/4 v5, 0x0

    .line 11
    invoke-static/range {v0 .. v5}, Lkotlin/collections/u;->x(Ljava/util/List;Ljava/lang/Comparable;IIILjava/lang/Object;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-gez v0, :cond_0

    .line 16
    .line 17
    add-int/lit8 v0, v0, 0x1

    .line 18
    .line 19
    neg-int v0, v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 22
    .line 23
    :goto_0
    if-eqz p2, :cond_1

    .line 24
    .line 25
    if-lez v0, :cond_1

    .line 26
    .line 27
    iget-object p2, p0, Landroidx/compose/ui/text/android/LayoutHelper;->paragraphEnds:Ljava/util/List;

    .line 28
    .line 29
    add-int/lit8 v1, v0, -0x1

    .line 30
    .line 31
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    check-cast p2, Ljava/lang/Number;

    .line 36
    .line 37
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    if-ne p1, p2, :cond_1

    .line 42
    .line 43
    return v1

    .line 44
    :cond_1
    return v0
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
.end method

.method public final getParagraphStart(I)I
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/text/android/LayoutHelper;->paragraphEnds:Ljava/util/List;

    add-int/lit8 p1, p1, -0x1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    :goto_0
    return p1
.end method

.method public final isLineEndSpace(C)Z
    .locals 1

    const/16 v0, 0x20

    if-eq p1, v0, :cond_2

    const/16 v0, 0xa

    if-eq p1, v0, :cond_2

    const/16 v0, 0x1680

    if-eq p1, v0, :cond_2

    const/16 v0, 0x2000

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->t(II)I

    move-result v0

    if-ltz v0, :cond_0

    const/16 v0, 0x200a

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->t(II)I

    move-result v0

    if-gtz v0, :cond_0

    const/16 v0, 0x2007

    if-ne p1, v0, :cond_2

    :cond_0
    const/16 v0, 0x205f

    if-eq p1, v0, :cond_2

    const/16 v0, 0x3000

    if-ne p1, v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final isRtlParagraph(I)Z
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/android/LayoutHelper;->layout:Landroid/text/Layout;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/compose/ui/text/android/LayoutHelper;->getParagraphStart(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineForOffset(I)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget-object v0, p0, Landroidx/compose/ui/text/android/LayoutHelper;->layout:Landroid/text/Layout;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Landroid/text/Layout;->getParagraphDirection(I)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    const/4 v0, -0x1

    .line 18
    if-ne p1, v0, :cond_0

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p1, 0x0

    .line 23
    :goto_0
    return p1
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method
