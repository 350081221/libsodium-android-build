.class public Lcom/zzhoujay/markdown/parser/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zzhoujay/markdown/parser/d;


# static fields
.field private static final c:I

.field private static final d:I

.field private static final e:I

.field private static final f:I

.field private static final g:I

.field private static final h:I

.field private static final i:F = 2.25f

.field private static final j:F = 1.75f

.field private static final k:F = 1.5f

.field private static final l:F = 1.25f

.field private static final m:F = 1.0f

.field private static final n:F = 1.0f

.field private static final o:F = 1.0f


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/widget/TextView;",
            ">;"
        }
    .end annotation
.end field

.field private b:Landroid/text/Html$ImageGetter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "#333333"

    .line 2
    .line 3
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sput v0, Lcom/zzhoujay/markdown/parser/e;->c:I

    .line 8
    .line 9
    const-string v0, "#777777"

    .line 10
    .line 11
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    sput v0, Lcom/zzhoujay/markdown/parser/e;->d:I

    .line 16
    .line 17
    const-string v0, "#DDDDDD"

    .line 18
    .line 19
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    sput v0, Lcom/zzhoujay/markdown/parser/e;->e:I

    .line 24
    .line 25
    const-string v0, "#F0F0F0"

    .line 26
    .line 27
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    sput v0, Lcom/zzhoujay/markdown/parser/e;->f:I

    .line 32
    .line 33
    const-string v0, "#4078C0"

    .line 34
    .line 35
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    sput v0, Lcom/zzhoujay/markdown/parser/e;->g:I

    .line 40
    .line 41
    const-string v0, "#eeeeee"

    .line 42
    .line 43
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    sput v0, Lcom/zzhoujay/markdown/parser/e;->h:I

    .line 48
    .line 49
    return-void
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
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method public constructor <init>(Landroid/widget/TextView;Landroid/text/Html$ImageGetter;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/zzhoujay/markdown/parser/e;->a:Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/zzhoujay/markdown/parser/e;->b:Landroid/text/Html$ImageGetter;

    .line 12
    .line 13
    return-void
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
.end method

.method private w()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zzhoujay/markdown/parser/e;->a:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/widget/TextView;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    sub-int/2addr v1, v2

    .line 20
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    sub-int/2addr v1, v0

    .line 25
    return v1

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    return v0
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
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method private y(Ljava/lang/CharSequence;F)Landroid/text/SpannableStringBuilder;
    .locals 7

    .line 1
    new-instance v0, Landroid/text/SpannableStringBuilder;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/zzhoujay/markdown/style/FontSpan;

    .line 7
    .line 8
    sget v2, Lcom/zzhoujay/markdown/parser/e;->c:I

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    invoke-direct {v1, p2, v3, v2}, Lcom/zzhoujay/markdown/style/FontSpan;-><init>(FII)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    const/4 v2, 0x0

    .line 19
    const/16 v4, 0x21

    .line 20
    .line 21
    invoke-virtual {v0, v1, v2, p2, v4}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 22
    .line 23
    .line 24
    new-instance p2, Landroid/graphics/drawable/ColorDrawable;

    .line 25
    .line 26
    sget v1, Lcom/zzhoujay/markdown/parser/e;->h:I

    .line 27
    .line 28
    invoke-direct {p2, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 29
    .line 30
    .line 31
    new-instance v1, Lc3/e;

    .line 32
    .line 33
    invoke-direct {p0}, Lcom/zzhoujay/markdown/parser/e;->w()I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    const/4 v6, 0x5

    .line 38
    invoke-direct {v1, p2, v5, v6}, Lc3/e;-><init>(Landroid/graphics/drawable/Drawable;II)V

    .line 39
    .line 40
    .line 41
    const/16 p2, 0xa

    .line 42
    .line 43
    invoke-virtual {v0, p2}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    add-int/2addr p1, v3

    .line 51
    add-int/2addr p1, v2

    .line 52
    const-string p2, "$"

    .line 53
    .line 54
    invoke-virtual {v0, p2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    invoke-virtual {v0, v1, p1, p2, v4}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 62
    .line 63
    .line 64
    return-object v0
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
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
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


# virtual methods
.method public a(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
    .locals 5

    .line 1
    invoke-static {p1}, Landroid/text/SpannableStringBuilder;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zzhoujay/markdown/style/FontSpan;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    sget v3, Lcom/zzhoujay/markdown/parser/e;->c:I

    .line 9
    .line 10
    const/high16 v4, 0x3f800000    # 1.0f

    .line 11
    .line 12
    invoke-direct {v1, v4, v2, v3}, Lcom/zzhoujay/markdown/style/FontSpan;-><init>(FII)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    const/16 v2, 0x21

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-virtual {v0, v1, v3, p1, v2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 23
    .line 24
    .line 25
    return-object v0
    .line 26
    .line 27
.end method

.method public b(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
    .locals 1

    const/high16 v0, 0x3fe00000    # 1.75f

    invoke-direct {p0, p1, v0}, Lcom/zzhoujay/markdown/parser/e;->y(Ljava/lang/CharSequence;F)Landroid/text/SpannableStringBuilder;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/String;)Landroid/text/SpannableStringBuilder;
    .locals 1

    .line 1
    const-string v0, "\n"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, [Ljava/lang/CharSequence;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lcom/zzhoujay/markdown/parser/e;->r([Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
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

.method public d()Landroid/text/SpannableStringBuilder;
    .locals 5

    .line 1
    new-instance v0, Landroid/text/SpannableStringBuilder;

    .line 2
    .line 3
    const-string v1, "$"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    .line 9
    .line 10
    sget v2, Lcom/zzhoujay/markdown/parser/e;->h:I

    .line 11
    .line 12
    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lc3/e;

    .line 16
    .line 17
    invoke-direct {p0}, Lcom/zzhoujay/markdown/parser/e;->w()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    const/16 v4, 0xa

    .line 22
    .line 23
    invoke-direct {v2, v1, v3, v4}, Lc3/e;-><init>(Landroid/graphics/drawable/Drawable;II)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    const/16 v3, 0x21

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    invoke-virtual {v0, v2, v4, v1, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 34
    .line 35
    .line 36
    return-object v0
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
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method public e(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
    .locals 5

    .line 1
    invoke-static {p1}, Landroid/text/SpannableStringBuilder;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zzhoujay/markdown/style/FontSpan;

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    sget v3, Lcom/zzhoujay/markdown/parser/e;->c:I

    .line 9
    .line 10
    const/high16 v4, 0x3f800000    # 1.0f

    .line 11
    .line 12
    invoke-direct {v1, v4, v2, v3}, Lcom/zzhoujay/markdown/style/FontSpan;-><init>(FII)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    const/16 v2, 0x21

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-virtual {v0, v1, v3, p1, v2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 23
    .line 24
    .line 25
    return-object v0
    .line 26
    .line 27
.end method

.method public f(Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;)Landroid/text/SpannableStringBuilder;
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 4
    .line 5
    .line 6
    move-result p3

    .line 7
    if-nez p3, :cond_1

    .line 8
    .line 9
    :cond_0
    const-string p1, "$"

    .line 10
    .line 11
    :cond_1
    invoke-static {p1}, Landroid/text/SpannableStringBuilder;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object p3, p0, Lcom/zzhoujay/markdown/parser/e;->b:Landroid/text/Html$ImageGetter;

    .line 16
    .line 17
    if-eqz p3, :cond_2

    .line 18
    .line 19
    invoke-interface {p3, p2}, Landroid/text/Html$ImageGetter;->getDrawable(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    goto :goto_0

    .line 24
    :cond_2
    const/4 p3, 0x0

    .line 25
    :goto_0
    const/4 v0, 0x0

    .line 26
    if-nez p3, :cond_3

    .line 27
    .line 28
    new-instance p3, Landroid/graphics/drawable/ColorDrawable;

    .line 29
    .line 30
    invoke-direct {p3, v0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 31
    .line 32
    .line 33
    :cond_3
    new-instance v1, Landroid/text/style/ImageSpan;

    .line 34
    .line 35
    invoke-direct {v1, p3, p2}, Landroid/text/style/ImageSpan;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    const/16 p3, 0x21

    .line 43
    .line 44
    invoke-virtual {p1, v1, v0, p2, p3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 45
    .line 46
    .line 47
    return-object p1
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
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public g(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
    .locals 1

    const/high16 v0, 0x40100000    # 2.25f

    invoke-direct {p0, p1, v0}, Lcom/zzhoujay/markdown/parser/e;->y(Ljava/lang/CharSequence;F)Landroid/text/SpannableStringBuilder;

    move-result-object p1

    return-object p1
.end method

.method public h(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
    .locals 4

    .line 1
    invoke-static {p1}, Landroid/text/SpannableStringBuilder;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Lcom/zzhoujay/markdown/style/MarkDownQuoteSpan;

    .line 6
    .line 7
    sget v1, Lcom/zzhoujay/markdown/parser/e;->e:I

    .line 8
    .line 9
    invoke-direct {v0, v1}, Lcom/zzhoujay/markdown/style/MarkDownQuoteSpan;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/16 v2, 0x21

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-virtual {p1, v0, v3, v1, v2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 20
    .line 21
    .line 22
    return-object p1
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public i(Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;)Landroid/text/SpannableStringBuilder;
    .locals 2

    .line 1
    invoke-static {p1}, Landroid/text/SpannableStringBuilder;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    new-instance v0, Lcom/zzhoujay/markdown/style/LinkSpan;

    .line 6
    .line 7
    sget v1, Lcom/zzhoujay/markdown/parser/e;->g:I

    .line 8
    .line 9
    invoke-direct {v0, p2, v1}, Lcom/zzhoujay/markdown/style/LinkSpan;-><init>(Ljava/lang/String;I)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const/16 p2, 0x21

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-virtual {p3, v0, v1, p1, p2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 20
    .line 21
    .line 22
    return-object p3
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
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public j(Ljava/lang/CharSequence;III)Landroid/text/SpannableStringBuilder;
    .locals 8

    .line 1
    invoke-static {p1}, Landroid/text/SpannableStringBuilder;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v7, Lcom/zzhoujay/markdown/style/QuotaBulletSpan;

    .line 6
    .line 7
    sget v3, Lcom/zzhoujay/markdown/parser/e;->e:I

    .line 8
    .line 9
    sget v4, Lcom/zzhoujay/markdown/parser/e;->c:I

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zzhoujay/markdown/parser/e;->a:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    move-object v6, v0

    .line 18
    check-cast v6, Landroid/widget/TextView;

    .line 19
    .line 20
    move-object v0, v7

    .line 21
    move v1, p2

    .line 22
    move v2, p3

    .line 23
    move v5, p4

    .line 24
    invoke-direct/range {v0 .. v6}, Lcom/zzhoujay/markdown/style/QuotaBulletSpan;-><init>(IIIIILandroid/widget/TextView;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    const/16 p3, 0x21

    .line 32
    .line 33
    const/4 p4, 0x0

    .line 34
    invoke-virtual {p1, v7, p4, p2, p3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 35
    .line 36
    .line 37
    return-object p1
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
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
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

.method public k(Ljava/lang/CharSequence;I)Landroid/text/SpannableStringBuilder;
    .locals 3

    .line 1
    invoke-static {p1}, Landroid/text/SpannableStringBuilder;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Lcom/zzhoujay/markdown/style/MarkDownBulletSpan;

    .line 6
    .line 7
    sget v1, Lcom/zzhoujay/markdown/parser/e;->c:I

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v0, p2, v1, v2}, Lcom/zzhoujay/markdown/style/MarkDownBulletSpan;-><init>(III)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    const/16 v1, 0x21

    .line 18
    .line 19
    invoke-virtual {p1, v0, v2, p2, v1}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 20
    .line 21
    .line 22
    return-object p1
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
.end method

.method public l(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
    .locals 5

    .line 1
    invoke-static {p1}, Landroid/text/SpannableStringBuilder;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zzhoujay/markdown/style/FontSpan;

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    sget v3, Lcom/zzhoujay/markdown/parser/e;->c:I

    .line 9
    .line 10
    const/high16 v4, 0x3f800000    # 1.0f

    .line 11
    .line 12
    invoke-direct {v1, v4, v2, v3}, Lcom/zzhoujay/markdown/style/FontSpan;-><init>(FII)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    const/16 v2, 0x21

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-virtual {v0, v1, v3, p1, v2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 23
    .line 24
    .line 25
    return-object v0
    .line 26
    .line 27
.end method

.method public m(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
    .locals 4

    .line 1
    invoke-static {p1}, Landroid/text/SpannableStringBuilder;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zzhoujay/markdown/style/EmailSpan;

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    sget v3, Lcom/zzhoujay/markdown/parser/e;->g:I

    .line 12
    .line 13
    invoke-direct {v1, v2, v3}, Lcom/zzhoujay/markdown/style/EmailSpan;-><init>(Ljava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    const/16 v2, 0x21

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-virtual {v0, v1, v3, p1, v2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 24
    .line 25
    .line 26
    return-object v0
    .line 27
.end method

.method public n(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
    .locals 4

    .line 1
    invoke-static {p1}, Landroid/text/SpannableStringBuilder;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lc3/b;

    .line 6
    .line 7
    sget v2, Lcom/zzhoujay/markdown/parser/e;->f:I

    .line 8
    .line 9
    invoke-direct {v1, v2}, Lc3/b;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const/16 v2, 0x21

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-virtual {v0, v1, v3, p1, v2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 20
    .line 21
    .line 22
    return-object v0
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public o(Ljava/lang/CharSequence;II)Landroid/text/SpannableStringBuilder;
    .locals 3

    .line 1
    invoke-static {p1}, Landroid/text/SpannableStringBuilder;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Lcom/zzhoujay/markdown/style/MarkDownBulletSpan;

    .line 6
    .line 7
    sget v1, Lcom/zzhoujay/markdown/parser/e;->c:I

    .line 8
    .line 9
    iget-object v2, p0, Lcom/zzhoujay/markdown/parser/e;->a:Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Landroid/widget/TextView;

    .line 16
    .line 17
    invoke-direct {v0, p2, v1, p3, v2}, Lcom/zzhoujay/markdown/style/MarkDownBulletSpan;-><init>(IIILandroid/widget/TextView;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    const/16 p3, 0x21

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-virtual {p1, v0, v1, p2, p3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 28
    .line 29
    .line 30
    return-object p1
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
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public p(Ljava/lang/CharSequence;II)Landroid/text/SpannableStringBuilder;
    .locals 8

    .line 1
    invoke-static {p1}, Landroid/text/SpannableStringBuilder;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v7, Lcom/zzhoujay/markdown/style/QuotaBulletSpan;

    .line 6
    .line 7
    sget v3, Lcom/zzhoujay/markdown/parser/e;->e:I

    .line 8
    .line 9
    sget v4, Lcom/zzhoujay/markdown/parser/e;->c:I

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    iget-object v0, p0, Lcom/zzhoujay/markdown/parser/e;->a:Ljava/lang/ref/WeakReference;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    move-object v6, v0

    .line 19
    check-cast v6, Landroid/widget/TextView;

    .line 20
    .line 21
    move-object v0, v7

    .line 22
    move v1, p2

    .line 23
    move v2, p3

    .line 24
    invoke-direct/range {v0 .. v6}, Lcom/zzhoujay/markdown/style/QuotaBulletSpan;-><init>(IIIIILandroid/widget/TextView;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    const/16 p3, 0x21

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    invoke-virtual {p1, v7, v0, p2, p3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 35
    .line 36
    .line 37
    return-object p1
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
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public q(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
    .locals 6

    .line 1
    invoke-static {p1}, Landroid/text/SpannableStringBuilder;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Landroid/text/style/StrikethroughSpan;

    .line 6
    .line 7
    invoke-direct {v1}, Landroid/text/style/StrikethroughSpan;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v2, Landroid/text/style/ForegroundColorSpan;

    .line 11
    .line 12
    sget v3, Lcom/zzhoujay/markdown/parser/e;->c:I

    .line 13
    .line 14
    invoke-direct {v2, v3}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    const/4 v4, 0x0

    .line 22
    const/16 v5, 0x21

    .line 23
    .line 24
    invoke-virtual {v0, v2, v4, v3, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    invoke-virtual {v0, v1, v4, p1, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 32
    .line 33
    .line 34
    return-object v0
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

.method public varargs r([Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
    .locals 4

    .line 1
    const-string v0, "$"

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/SpannableStringBuilder;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lc3/a;

    .line 8
    .line 9
    invoke-direct {p0}, Lcom/zzhoujay/markdown/parser/e;->w()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    sget v3, Lcom/zzhoujay/markdown/parser/e;->f:I

    .line 14
    .line 15
    invoke-direct {v1, v2, v3, p1}, Lc3/a;-><init>(II[Ljava/lang/CharSequence;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    const/16 v2, 0x21

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-virtual {v0, v1, v3, p1, v2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 26
    .line 27
    .line 28
    return-object v0
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
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method

.method public s(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
    .locals 2

    const/high16 v0, 0x3fa00000    # 1.25f

    sget v1, Lcom/zzhoujay/markdown/parser/e;->c:I

    invoke-virtual {p0, p1, v0, v1}, Lcom/zzhoujay/markdown/parser/e;->x(Ljava/lang/CharSequence;FI)Landroid/text/SpannableStringBuilder;

    move-result-object p1

    return-object p1
.end method

.method public t(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
    .locals 2

    const/high16 v0, 0x3fc00000    # 1.5f

    sget v1, Lcom/zzhoujay/markdown/parser/e;->c:I

    invoke-virtual {p0, p1, v0, v1}, Lcom/zzhoujay/markdown/parser/e;->x(Ljava/lang/CharSequence;FI)Landroid/text/SpannableStringBuilder;

    move-result-object p1

    return-object p1
.end method

.method public u(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
    .locals 2

    const/high16 v0, 0x3f800000    # 1.0f

    sget v1, Lcom/zzhoujay/markdown/parser/e;->d:I

    invoke-virtual {p0, p1, v0, v1}, Lcom/zzhoujay/markdown/parser/e;->x(Ljava/lang/CharSequence;FI)Landroid/text/SpannableStringBuilder;

    move-result-object p1

    return-object p1
.end method

.method public v(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
    .locals 2

    const/high16 v0, 0x3f800000    # 1.0f

    sget v1, Lcom/zzhoujay/markdown/parser/e;->c:I

    invoke-virtual {p0, p1, v0, v1}, Lcom/zzhoujay/markdown/parser/e;->x(Ljava/lang/CharSequence;FI)Landroid/text/SpannableStringBuilder;

    move-result-object p1

    return-object p1
.end method

.method protected x(Ljava/lang/CharSequence;FI)Landroid/text/SpannableStringBuilder;
    .locals 2

    .line 1
    invoke-static {p1}, Landroid/text/SpannableStringBuilder;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Lcom/zzhoujay/markdown/style/FontSpan;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, p2, v1, p3}, Lcom/zzhoujay/markdown/style/FontSpan;-><init>(FII)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    const/16 p3, 0x21

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-virtual {p1, v0, v1, p2, p3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 19
    .line 20
    .line 21
    return-object p1
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
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method
