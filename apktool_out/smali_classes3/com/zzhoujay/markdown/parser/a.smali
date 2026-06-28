.class public Lcom/zzhoujay/markdown/parser/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final l:I = 0x0

.field public static final m:I = 0x1

.field public static final n:I = 0x2

.field public static final o:I = 0x3

.field public static final p:I = 0x4

.field public static final q:I = 0x5

.field public static final r:I = 0x6

.field public static final s:I = 0x7

.field public static final t:I = 0x8

.field public static final u:I = 0x9

.field public static final v:I = 0xa

.field public static final w:I = 0xb

.field public static final x:I = 0xc

.field public static final y:I = 0x1


# instance fields
.field private a:Lcom/zzhoujay/markdown/parser/a;

.field private b:Lcom/zzhoujay/markdown/parser/a;

.field private c:Lcom/zzhoujay/markdown/parser/a;

.field private d:Lcom/zzhoujay/markdown/parser/a;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/CharSequence;

.field private g:I

.field private h:I

.field private i:I

.field private j:I

.field private k:I


# direct methods
.method private constructor <init>(Lcom/zzhoujay/markdown/parser/a;)V
    .locals 2

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iget-object v0, p1, Lcom/zzhoujay/markdown/parser/a;->e:Ljava/lang/String;

    iput-object v0, p0, Lcom/zzhoujay/markdown/parser/a;->e:Ljava/lang/String;

    .line 7
    iget v0, p1, Lcom/zzhoujay/markdown/parser/a;->h:I

    iput v0, p0, Lcom/zzhoujay/markdown/parser/a;->h:I

    .line 8
    iget v0, p1, Lcom/zzhoujay/markdown/parser/a;->i:I

    iput v0, p0, Lcom/zzhoujay/markdown/parser/a;->i:I

    .line 9
    iget-object v0, p1, Lcom/zzhoujay/markdown/parser/a;->f:Ljava/lang/CharSequence;

    if-eqz v0, :cond_0

    .line 10
    new-instance v0, Landroid/text/SpannableStringBuilder;

    iget-object v1, p1, Lcom/zzhoujay/markdown/parser/a;->f:Ljava/lang/CharSequence;

    invoke-direct {v0, v1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    iput-object v0, p0, Lcom/zzhoujay/markdown/parser/a;->f:Ljava/lang/CharSequence;

    .line 11
    :cond_0
    iget p1, p1, Lcom/zzhoujay/markdown/parser/a;->g:I

    iput p1, p0, Lcom/zzhoujay/markdown/parser/a;->g:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/zzhoujay/markdown/parser/a;->e:Ljava/lang/String;

    const/4 p1, 0x1

    .line 3
    iput p1, p0, Lcom/zzhoujay/markdown/parser/a;->h:I

    const/4 p1, 0x0

    .line 4
    iput p1, p0, Lcom/zzhoujay/markdown/parser/a;->g:I

    return-void
.end method

.method private l()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zzhoujay/markdown/parser/a;->d:Lcom/zzhoujay/markdown/parser/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-direct {v0}, Lcom/zzhoujay/markdown/parser/a;->l()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lcom/zzhoujay/markdown/parser/a;->a:Lcom/zzhoujay/markdown/parser/a;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iput-object v1, v0, Lcom/zzhoujay/markdown/parser/a;->b:Lcom/zzhoujay/markdown/parser/a;

    .line 14
    .line 15
    :cond_1
    iput-object v1, p0, Lcom/zzhoujay/markdown/parser/a;->a:Lcom/zzhoujay/markdown/parser/a;

    .line 16
    .line 17
    iget-object v0, p0, Lcom/zzhoujay/markdown/parser/a;->b:Lcom/zzhoujay/markdown/parser/a;

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    iput-object v1, v0, Lcom/zzhoujay/markdown/parser/a;->a:Lcom/zzhoujay/markdown/parser/a;

    .line 22
    .line 23
    :cond_2
    iput-object v1, p0, Lcom/zzhoujay/markdown/parser/a;->b:Lcom/zzhoujay/markdown/parser/a;

    .line 24
    .line 25
    return-void
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

.method private x()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zzhoujay/markdown/parser/a;->d:Lcom/zzhoujay/markdown/parser/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-direct {v0}, Lcom/zzhoujay/markdown/parser/a;->x()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lcom/zzhoujay/markdown/parser/a;->a:Lcom/zzhoujay/markdown/parser/a;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v1, p0, Lcom/zzhoujay/markdown/parser/a;->b:Lcom/zzhoujay/markdown/parser/a;

    .line 13
    .line 14
    iput-object v1, v0, Lcom/zzhoujay/markdown/parser/a;->b:Lcom/zzhoujay/markdown/parser/a;

    .line 15
    .line 16
    :cond_1
    iget-object v1, p0, Lcom/zzhoujay/markdown/parser/a;->b:Lcom/zzhoujay/markdown/parser/a;

    .line 17
    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    iput-object v0, v1, Lcom/zzhoujay/markdown/parser/a;->a:Lcom/zzhoujay/markdown/parser/a;

    .line 21
    .line 22
    :cond_2
    const/4 v0, 0x0

    .line 23
    iput-object v0, p0, Lcom/zzhoujay/markdown/parser/a;->b:Lcom/zzhoujay/markdown/parser/a;

    .line 24
    .line 25
    iput-object v0, p0, Lcom/zzhoujay/markdown/parser/a;->a:Lcom/zzhoujay/markdown/parser/a;

    .line 26
    .line 27
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


# virtual methods
.method public A()Lcom/zzhoujay/markdown/parser/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zzhoujay/markdown/parser/a;->a:Lcom/zzhoujay/markdown/parser/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zzhoujay/markdown/parser/a;->y()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-object p0
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
.end method

.method public B(I)V
    .locals 0

    iput p1, p0, Lcom/zzhoujay/markdown/parser/a;->i:I

    return-void
.end method

.method public C(I)V
    .locals 0

    iput p1, p0, Lcom/zzhoujay/markdown/parser/a;->h:I

    return-void
.end method

.method public D(I)V
    .locals 0

    iput p1, p0, Lcom/zzhoujay/markdown/parser/a;->k:I

    return-void
.end method

.method public E(I)V
    .locals 0

    iput p1, p0, Lcom/zzhoujay/markdown/parser/a;->j:I

    return-void
.end method

.method public F(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/zzhoujay/markdown/parser/a;->e:Ljava/lang/String;

    return-void
.end method

.method public G(Ljava/lang/CharSequence;)V
    .locals 0

    iput-object p1, p0, Lcom/zzhoujay/markdown/parser/a;->f:Ljava/lang/CharSequence;

    return-void
.end method

.method public H(I)V
    .locals 0

    iput p1, p0, Lcom/zzhoujay/markdown/parser/a;->g:I

    return-void
.end method

.method public I()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zzhoujay/markdown/parser/a;->c:Lcom/zzhoujay/markdown/parser/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-direct {p0}, Lcom/zzhoujay/markdown/parser/a;->l()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/zzhoujay/markdown/parser/a;->c:Lcom/zzhoujay/markdown/parser/a;

    .line 10
    .line 11
    iput-object v1, v0, Lcom/zzhoujay/markdown/parser/a;->d:Lcom/zzhoujay/markdown/parser/a;

    .line 12
    .line 13
    :cond_0
    iput-object v1, p0, Lcom/zzhoujay/markdown/parser/a;->c:Lcom/zzhoujay/markdown/parser/a;

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public a(Lcom/zzhoujay/markdown/parser/a;)Lcom/zzhoujay/markdown/parser/a;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/zzhoujay/markdown/parser/a;->c(Lcom/zzhoujay/markdown/parser/a;)Lcom/zzhoujay/markdown/parser/a;

    move-result-object p1

    return-object p1
.end method

.method public b(Lcom/zzhoujay/markdown/parser/a;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zzhoujay/markdown/parser/a;->d:Lcom/zzhoujay/markdown/parser/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-object v1, v0, Lcom/zzhoujay/markdown/parser/a;->c:Lcom/zzhoujay/markdown/parser/a;

    .line 7
    .line 8
    :cond_0
    iput-object p1, p0, Lcom/zzhoujay/markdown/parser/a;->d:Lcom/zzhoujay/markdown/parser/a;

    .line 9
    .line 10
    iget-object v0, p1, Lcom/zzhoujay/markdown/parser/a;->c:Lcom/zzhoujay/markdown/parser/a;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iput-object v1, v0, Lcom/zzhoujay/markdown/parser/a;->d:Lcom/zzhoujay/markdown/parser/a;

    .line 15
    .line 16
    :cond_1
    iput-object p0, p1, Lcom/zzhoujay/markdown/parser/a;->c:Lcom/zzhoujay/markdown/parser/a;

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/zzhoujay/markdown/parser/a;->e()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/zzhoujay/markdown/parser/a;->f()V

    .line 22
    .line 23
    .line 24
    return-void
    .line 25
    .line 26
    .line 27
.end method

.method public c(Lcom/zzhoujay/markdown/parser/a;)Lcom/zzhoujay/markdown/parser/a;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    iput-object v0, p0, Lcom/zzhoujay/markdown/parser/a;->b:Lcom/zzhoujay/markdown/parser/a;

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    iget-object v1, p1, Lcom/zzhoujay/markdown/parser/a;->b:Lcom/zzhoujay/markdown/parser/a;

    .line 8
    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    iput-object v0, v1, Lcom/zzhoujay/markdown/parser/a;->a:Lcom/zzhoujay/markdown/parser/a;

    .line 12
    .line 13
    :cond_1
    iget-object v1, p0, Lcom/zzhoujay/markdown/parser/a;->b:Lcom/zzhoujay/markdown/parser/a;

    .line 14
    .line 15
    iput-object v1, p1, Lcom/zzhoujay/markdown/parser/a;->b:Lcom/zzhoujay/markdown/parser/a;

    .line 16
    .line 17
    iget-object v1, p0, Lcom/zzhoujay/markdown/parser/a;->b:Lcom/zzhoujay/markdown/parser/a;

    .line 18
    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    iput-object p1, v1, Lcom/zzhoujay/markdown/parser/a;->a:Lcom/zzhoujay/markdown/parser/a;

    .line 22
    .line 23
    :cond_2
    iget-object v1, p1, Lcom/zzhoujay/markdown/parser/a;->a:Lcom/zzhoujay/markdown/parser/a;

    .line 24
    .line 25
    if-eqz v1, :cond_3

    .line 26
    .line 27
    iput-object v0, v1, Lcom/zzhoujay/markdown/parser/a;->b:Lcom/zzhoujay/markdown/parser/a;

    .line 28
    .line 29
    :cond_3
    iput-object p0, p1, Lcom/zzhoujay/markdown/parser/a;->a:Lcom/zzhoujay/markdown/parser/a;

    .line 30
    .line 31
    iput-object p1, p0, Lcom/zzhoujay/markdown/parser/a;->b:Lcom/zzhoujay/markdown/parser/a;

    .line 32
    .line 33
    iget-object v0, p0, Lcom/zzhoujay/markdown/parser/a;->d:Lcom/zzhoujay/markdown/parser/a;

    .line 34
    .line 35
    if-eqz v0, :cond_4

    .line 36
    .line 37
    iget-object v1, p1, Lcom/zzhoujay/markdown/parser/a;->d:Lcom/zzhoujay/markdown/parser/a;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Lcom/zzhoujay/markdown/parser/a;->c(Lcom/zzhoujay/markdown/parser/a;)Lcom/zzhoujay/markdown/parser/a;

    .line 40
    .line 41
    .line 42
    :cond_4
    :goto_0
    return-object p1
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

.method public d(Lcom/zzhoujay/markdown/parser/a;)Lcom/zzhoujay/markdown/parser/a;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    iput-object v0, p0, Lcom/zzhoujay/markdown/parser/a;->a:Lcom/zzhoujay/markdown/parser/a;

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    iget-object v1, p1, Lcom/zzhoujay/markdown/parser/a;->a:Lcom/zzhoujay/markdown/parser/a;

    .line 8
    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    iput-object v0, v1, Lcom/zzhoujay/markdown/parser/a;->b:Lcom/zzhoujay/markdown/parser/a;

    .line 12
    .line 13
    :cond_1
    iget-object v1, p0, Lcom/zzhoujay/markdown/parser/a;->a:Lcom/zzhoujay/markdown/parser/a;

    .line 14
    .line 15
    iput-object v1, p1, Lcom/zzhoujay/markdown/parser/a;->a:Lcom/zzhoujay/markdown/parser/a;

    .line 16
    .line 17
    iget-object v1, p0, Lcom/zzhoujay/markdown/parser/a;->a:Lcom/zzhoujay/markdown/parser/a;

    .line 18
    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    iput-object p1, v1, Lcom/zzhoujay/markdown/parser/a;->b:Lcom/zzhoujay/markdown/parser/a;

    .line 22
    .line 23
    :cond_2
    iget-object v1, p1, Lcom/zzhoujay/markdown/parser/a;->b:Lcom/zzhoujay/markdown/parser/a;

    .line 24
    .line 25
    if-eqz v1, :cond_3

    .line 26
    .line 27
    iput-object v0, v1, Lcom/zzhoujay/markdown/parser/a;->a:Lcom/zzhoujay/markdown/parser/a;

    .line 28
    .line 29
    :cond_3
    iput-object p0, p1, Lcom/zzhoujay/markdown/parser/a;->b:Lcom/zzhoujay/markdown/parser/a;

    .line 30
    .line 31
    iput-object p1, p0, Lcom/zzhoujay/markdown/parser/a;->a:Lcom/zzhoujay/markdown/parser/a;

    .line 32
    .line 33
    iget-object v0, p0, Lcom/zzhoujay/markdown/parser/a;->d:Lcom/zzhoujay/markdown/parser/a;

    .line 34
    .line 35
    if-eqz v0, :cond_4

    .line 36
    .line 37
    iget-object v1, p1, Lcom/zzhoujay/markdown/parser/a;->d:Lcom/zzhoujay/markdown/parser/a;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Lcom/zzhoujay/markdown/parser/a;->d(Lcom/zzhoujay/markdown/parser/a;)Lcom/zzhoujay/markdown/parser/a;

    .line 40
    .line 41
    .line 42
    :cond_4
    :goto_0
    return-object p1
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

.method public e()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zzhoujay/markdown/parser/a;->d:Lcom/zzhoujay/markdown/parser/a;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zzhoujay/markdown/parser/a;->b:Lcom/zzhoujay/markdown/parser/a;

    .line 6
    .line 7
    if-eqz v1, :cond_3

    .line 8
    .line 9
    iget-object v2, v0, Lcom/zzhoujay/markdown/parser/a;->b:Lcom/zzhoujay/markdown/parser/a;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    iput-object v3, v2, Lcom/zzhoujay/markdown/parser/a;->a:Lcom/zzhoujay/markdown/parser/a;

    .line 15
    .line 16
    :cond_0
    iget-object v1, v1, Lcom/zzhoujay/markdown/parser/a;->d:Lcom/zzhoujay/markdown/parser/a;

    .line 17
    .line 18
    iput-object v1, v0, Lcom/zzhoujay/markdown/parser/a;->b:Lcom/zzhoujay/markdown/parser/a;

    .line 19
    .line 20
    iget-object v1, p0, Lcom/zzhoujay/markdown/parser/a;->b:Lcom/zzhoujay/markdown/parser/a;

    .line 21
    .line 22
    iget-object v1, v1, Lcom/zzhoujay/markdown/parser/a;->d:Lcom/zzhoujay/markdown/parser/a;

    .line 23
    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    iget-object v1, v1, Lcom/zzhoujay/markdown/parser/a;->a:Lcom/zzhoujay/markdown/parser/a;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    iput-object v3, v1, Lcom/zzhoujay/markdown/parser/a;->b:Lcom/zzhoujay/markdown/parser/a;

    .line 31
    .line 32
    :cond_1
    iget-object v1, p0, Lcom/zzhoujay/markdown/parser/a;->b:Lcom/zzhoujay/markdown/parser/a;

    .line 33
    .line 34
    iget-object v1, v1, Lcom/zzhoujay/markdown/parser/a;->d:Lcom/zzhoujay/markdown/parser/a;

    .line 35
    .line 36
    iput-object v0, v1, Lcom/zzhoujay/markdown/parser/a;->a:Lcom/zzhoujay/markdown/parser/a;

    .line 37
    .line 38
    :cond_2
    invoke-virtual {v0}, Lcom/zzhoujay/markdown/parser/a;->e()V

    .line 39
    .line 40
    .line 41
    :cond_3
    return-void
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

.method public f()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zzhoujay/markdown/parser/a;->d:Lcom/zzhoujay/markdown/parser/a;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zzhoujay/markdown/parser/a;->a:Lcom/zzhoujay/markdown/parser/a;

    .line 6
    .line 7
    if-eqz v1, :cond_3

    .line 8
    .line 9
    iget-object v2, v0, Lcom/zzhoujay/markdown/parser/a;->a:Lcom/zzhoujay/markdown/parser/a;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    iput-object v3, v2, Lcom/zzhoujay/markdown/parser/a;->b:Lcom/zzhoujay/markdown/parser/a;

    .line 15
    .line 16
    :cond_0
    iget-object v1, v1, Lcom/zzhoujay/markdown/parser/a;->d:Lcom/zzhoujay/markdown/parser/a;

    .line 17
    .line 18
    iput-object v1, v0, Lcom/zzhoujay/markdown/parser/a;->a:Lcom/zzhoujay/markdown/parser/a;

    .line 19
    .line 20
    iget-object v1, p0, Lcom/zzhoujay/markdown/parser/a;->a:Lcom/zzhoujay/markdown/parser/a;

    .line 21
    .line 22
    iget-object v1, v1, Lcom/zzhoujay/markdown/parser/a;->d:Lcom/zzhoujay/markdown/parser/a;

    .line 23
    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    iget-object v1, v1, Lcom/zzhoujay/markdown/parser/a;->b:Lcom/zzhoujay/markdown/parser/a;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    iput-object v3, v1, Lcom/zzhoujay/markdown/parser/a;->a:Lcom/zzhoujay/markdown/parser/a;

    .line 31
    .line 32
    :cond_1
    iget-object v1, p0, Lcom/zzhoujay/markdown/parser/a;->a:Lcom/zzhoujay/markdown/parser/a;

    .line 33
    .line 34
    iget-object v1, v1, Lcom/zzhoujay/markdown/parser/a;->d:Lcom/zzhoujay/markdown/parser/a;

    .line 35
    .line 36
    iput-object v0, v1, Lcom/zzhoujay/markdown/parser/a;->b:Lcom/zzhoujay/markdown/parser/a;

    .line 37
    .line 38
    :cond_2
    invoke-virtual {v0}, Lcom/zzhoujay/markdown/parser/a;->f()V

    .line 39
    .line 40
    .line 41
    :cond_3
    return-void
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

.method public g(Lcom/zzhoujay/markdown/parser/a;)V
    .locals 0

    invoke-virtual {p1, p0}, Lcom/zzhoujay/markdown/parser/a;->b(Lcom/zzhoujay/markdown/parser/a;)V

    return-void
.end method

.method public h()Lcom/zzhoujay/markdown/parser/a;
    .locals 1

    iget-object v0, p0, Lcom/zzhoujay/markdown/parser/a;->d:Lcom/zzhoujay/markdown/parser/a;

    return-object v0
.end method

.method public i()Lcom/zzhoujay/markdown/parser/a;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zzhoujay/markdown/parser/a;->c:Lcom/zzhoujay/markdown/parser/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zzhoujay/markdown/parser/a;->i()Lcom/zzhoujay/markdown/parser/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    new-instance v1, Lcom/zzhoujay/markdown/parser/a;

    .line 12
    .line 13
    invoke-direct {v1, p0}, Lcom/zzhoujay/markdown/parser/a;-><init>(Lcom/zzhoujay/markdown/parser/a;)V

    .line 14
    .line 15
    .line 16
    if-nez v0, :cond_2

    .line 17
    .line 18
    iget-object v0, p0, Lcom/zzhoujay/markdown/parser/a;->b:Lcom/zzhoujay/markdown/parser/a;

    .line 19
    .line 20
    iput-object v0, v1, Lcom/zzhoujay/markdown/parser/a;->b:Lcom/zzhoujay/markdown/parser/a;

    .line 21
    .line 22
    iget-object v0, p0, Lcom/zzhoujay/markdown/parser/a;->b:Lcom/zzhoujay/markdown/parser/a;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iput-object v1, v0, Lcom/zzhoujay/markdown/parser/a;->a:Lcom/zzhoujay/markdown/parser/a;

    .line 27
    .line 28
    :cond_1
    iput-object p0, v1, Lcom/zzhoujay/markdown/parser/a;->a:Lcom/zzhoujay/markdown/parser/a;

    .line 29
    .line 30
    iput-object v1, p0, Lcom/zzhoujay/markdown/parser/a;->b:Lcom/zzhoujay/markdown/parser/a;

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_2
    invoke-virtual {v0, v1}, Lcom/zzhoujay/markdown/parser/a;->b(Lcom/zzhoujay/markdown/parser/a;)V

    .line 34
    .line 35
    .line 36
    :goto_1
    return-object v1
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

.method public j()Lcom/zzhoujay/markdown/parser/a;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zzhoujay/markdown/parser/a;->c:Lcom/zzhoujay/markdown/parser/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zzhoujay/markdown/parser/a;->j()Lcom/zzhoujay/markdown/parser/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    new-instance v1, Lcom/zzhoujay/markdown/parser/a;

    .line 12
    .line 13
    invoke-direct {v1, p0}, Lcom/zzhoujay/markdown/parser/a;-><init>(Lcom/zzhoujay/markdown/parser/a;)V

    .line 14
    .line 15
    .line 16
    if-nez v0, :cond_2

    .line 17
    .line 18
    iget-object v0, p0, Lcom/zzhoujay/markdown/parser/a;->a:Lcom/zzhoujay/markdown/parser/a;

    .line 19
    .line 20
    iput-object v0, v1, Lcom/zzhoujay/markdown/parser/a;->a:Lcom/zzhoujay/markdown/parser/a;

    .line 21
    .line 22
    iget-object v0, p0, Lcom/zzhoujay/markdown/parser/a;->a:Lcom/zzhoujay/markdown/parser/a;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iput-object v1, v0, Lcom/zzhoujay/markdown/parser/a;->b:Lcom/zzhoujay/markdown/parser/a;

    .line 27
    .line 28
    :cond_1
    iput-object p0, v1, Lcom/zzhoujay/markdown/parser/a;->b:Lcom/zzhoujay/markdown/parser/a;

    .line 29
    .line 30
    iput-object p0, p0, Lcom/zzhoujay/markdown/parser/a;->a:Lcom/zzhoujay/markdown/parser/a;

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_2
    invoke-virtual {v0, v1}, Lcom/zzhoujay/markdown/parser/a;->b(Lcom/zzhoujay/markdown/parser/a;)V

    .line 34
    .line 35
    .line 36
    :goto_1
    return-object v1
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

.method public k(Ljava/lang/String;)Lcom/zzhoujay/markdown/parser/a;
    .locals 1

    .line 1
    new-instance v0, Lcom/zzhoujay/markdown/parser/a;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lcom/zzhoujay/markdown/parser/a;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lcom/zzhoujay/markdown/parser/a;->b(Lcom/zzhoujay/markdown/parser/a;)V

    .line 7
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
.end method

.method public m()Lcom/zzhoujay/markdown/parser/a;
    .locals 0

    return-object p0
.end method

.method public n()I
    .locals 1

    iget v0, p0, Lcom/zzhoujay/markdown/parser/a;->i:I

    return v0
.end method

.method public o()I
    .locals 1

    iget v0, p0, Lcom/zzhoujay/markdown/parser/a;->h:I

    return v0
.end method

.method public p()I
    .locals 1

    iget v0, p0, Lcom/zzhoujay/markdown/parser/a;->k:I

    return v0
.end method

.method public q()I
    .locals 1

    iget v0, p0, Lcom/zzhoujay/markdown/parser/a;->j:I

    return v0
.end method

.method public r()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zzhoujay/markdown/parser/a;->e:Ljava/lang/String;

    return-object v0
.end method

.method public s()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lcom/zzhoujay/markdown/parser/a;->f:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public t()I
    .locals 1

    iget v0, p0, Lcom/zzhoujay/markdown/parser/a;->g:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zzhoujay/markdown/parser/a;->e:Ljava/lang/String;

    return-object v0
.end method

.method public u()Lcom/zzhoujay/markdown/parser/a;
    .locals 1

    iget-object v0, p0, Lcom/zzhoujay/markdown/parser/a;->b:Lcom/zzhoujay/markdown/parser/a;

    return-object v0
.end method

.method public v()Lcom/zzhoujay/markdown/parser/a;
    .locals 1

    iget-object v0, p0, Lcom/zzhoujay/markdown/parser/a;->c:Lcom/zzhoujay/markdown/parser/a;

    return-object v0
.end method

.method public w()Lcom/zzhoujay/markdown/parser/a;
    .locals 1

    iget-object v0, p0, Lcom/zzhoujay/markdown/parser/a;->a:Lcom/zzhoujay/markdown/parser/a;

    return-object v0
.end method

.method public y()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zzhoujay/markdown/parser/a;->c:Lcom/zzhoujay/markdown/parser/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/zzhoujay/markdown/parser/a;->x()V

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-direct {p0}, Lcom/zzhoujay/markdown/parser/a;->l()V

    .line 10
    .line 11
    .line 12
    :goto_0
    return-void
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
.end method

.method public z()Lcom/zzhoujay/markdown/parser/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zzhoujay/markdown/parser/a;->b:Lcom/zzhoujay/markdown/parser/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zzhoujay/markdown/parser/a;->y()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-object p0
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
.end method
