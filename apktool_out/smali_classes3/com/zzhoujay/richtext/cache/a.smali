.class public Lcom/zzhoujay/richtext/cache/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zzhoujay/richtext/cache/a$b;
    }
.end annotation


# static fields
.field private static final c:Ljava/lang/String; = "_rt"

.field private static final d:I = 0x100000

.field private static final e:I = 0x1f400000

.field private static final f:I

.field private static final g:I = 0x64

.field private static final h:Ljava/lang/String; = "_s"

.field private static final i:Ljava/lang/String; = "_t"

.field private static j:Ljava/io/File; = null

.field private static final k:I = 0x1

.field private static l:Lcom/jakewharton/disklrucache/a;

.field private static m:Lcom/jakewharton/disklrucache/a;

.field private static n:Ljava/io/File;

.field private static o:Ljava/io/File;


# instance fields
.field private a:Landroidx/collection/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/LruCache<",
            "Ljava/lang/String;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field private b:Landroidx/collection/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/LruCache<",
            "Ljava/lang/String;",
            "Lcom/zzhoujay/richtext/drawable/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->maxMemory()J

    move-result-wide v0

    const-wide/16 v2, 0x4

    div-long/2addr v0, v2

    long-to-int v0, v0

    sput v0, Lcom/zzhoujay/richtext/cache/a;->f:I

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lcom/zzhoujay/richtext/cache/a$a;

    sget v1, Lcom/zzhoujay/richtext/cache/a;->f:I

    invoke-direct {v0, p0, v1}, Lcom/zzhoujay/richtext/cache/a$a;-><init>(Lcom/zzhoujay/richtext/cache/a;I)V

    iput-object v0, p0, Lcom/zzhoujay/richtext/cache/a;->a:Landroidx/collection/LruCache;

    .line 4
    new-instance v0, Landroidx/collection/LruCache;

    const/16 v1, 0x64

    invoke-direct {v0, v1}, Landroidx/collection/LruCache;-><init>(I)V

    iput-object v0, p0, Lcom/zzhoujay/richtext/cache/a;->b:Landroidx/collection/LruCache;

    return-void
.end method

.method synthetic constructor <init>(Lcom/zzhoujay/richtext/cache/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zzhoujay/richtext/cache/a;-><init>()V

    return-void
.end method

.method public static g()Lcom/zzhoujay/richtext/cache/a;
    .locals 1

    invoke-static {}, Lcom/zzhoujay/richtext/cache/a$b;->a()Lcom/zzhoujay/richtext/cache/a;

    move-result-object v0

    return-object v0
.end method

.method private static h()Lcom/jakewharton/disklrucache/a;
    .locals 4

    .line 1
    sget-object v0, Lcom/zzhoujay/richtext/cache/a;->l:Lcom/jakewharton/disklrucache/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/zzhoujay/richtext/cache/a;->j:Ljava/io/File;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    :try_start_0
    sget-object v0, Lcom/zzhoujay/richtext/cache/a;->n:Ljava/io/File;

    .line 10
    .line 11
    const-wide/32 v1, 0x100000

    .line 12
    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    invoke-static {v0, v3, v3, v1, v2}, Lcom/jakewharton/disklrucache/a;->p0(Ljava/io/File;IIJ)Lcom/jakewharton/disklrucache/a;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lcom/zzhoujay/richtext/cache/a;->l:Lcom/jakewharton/disklrucache/a;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catch_0
    move-exception v0

    .line 23
    invoke-static {v0}, Lcom/zzhoujay/richtext/ext/c;->a(Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    :goto_0
    sget-object v0, Lcom/zzhoujay/richtext/cache/a;->l:Lcom/jakewharton/disklrucache/a;

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

.method private static j()Lcom/jakewharton/disklrucache/a;
    .locals 4

    .line 1
    sget-object v0, Lcom/zzhoujay/richtext/cache/a;->m:Lcom/jakewharton/disklrucache/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/zzhoujay/richtext/cache/a;->j:Ljava/io/File;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    :try_start_0
    sget-object v0, Lcom/zzhoujay/richtext/cache/a;->o:Ljava/io/File;

    .line 10
    .line 11
    const-wide/32 v1, 0x1f400000

    .line 12
    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    invoke-static {v0, v3, v3, v1, v2}, Lcom/jakewharton/disklrucache/a;->p0(Ljava/io/File;IIJ)Lcom/jakewharton/disklrucache/a;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lcom/zzhoujay/richtext/cache/a;->m:Lcom/jakewharton/disklrucache/a;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catch_0
    move-exception v0

    .line 23
    invoke-static {v0}, Lcom/zzhoujay/richtext/ext/c;->a(Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    :goto_0
    sget-object v0, Lcom/zzhoujay/richtext/cache/a;->m:Lcom/jakewharton/disklrucache/a;

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

.method public static k()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public static n(Ljava/io/File;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/zzhoujay/richtext/cache/a;->j:Ljava/io/File;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    if-eqz p0, :cond_2

    .line 6
    .line 7
    sput-object p0, Lcom/zzhoujay/richtext/cache/a;->j:Ljava/io/File;

    .line 8
    .line 9
    new-instance v0, Ljava/io/File;

    .line 10
    .line 11
    const-string v1, "_rt"

    .line 12
    .line 13
    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-nez p0, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/io/File;->mkdir()Z

    .line 23
    .line 24
    .line 25
    :cond_0
    new-instance p0, Ljava/io/File;

    .line 26
    .line 27
    const-string v1, "_s"

    .line 28
    .line 29
    invoke-direct {p0, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    sput-object p0, Lcom/zzhoujay/richtext/cache/a;->n:Ljava/io/File;

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-nez p0, :cond_1

    .line 39
    .line 40
    sget-object p0, Lcom/zzhoujay/richtext/cache/a;->n:Ljava/io/File;

    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/io/File;->mkdir()Z

    .line 43
    .line 44
    .line 45
    :cond_1
    new-instance p0, Ljava/io/File;

    .line 46
    .line 47
    const-string v1, "_t"

    .line 48
    .line 49
    invoke-direct {p0, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    sput-object p0, Lcom/zzhoujay/richtext/cache/a;->o:Ljava/io/File;

    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    if-nez p0, :cond_2

    .line 59
    .line 60
    sget-object p0, Lcom/zzhoujay/richtext/cache/a;->o:Ljava/io/File;

    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/io/File;->mkdir()Z

    .line 63
    .line 64
    .line 65
    :cond_2
    return-void
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
.method public a(Ljava/lang/String;Landroid/graphics/Bitmap;Lcom/zzhoujay/richtext/drawable/b;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zzhoujay/richtext/cache/a;->b(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p3}, Lcom/zzhoujay/richtext/cache/a;->c(Ljava/lang/String;Lcom/zzhoujay/richtext/drawable/b;)V

    .line 5
    .line 6
    .line 7
    return-void
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

.method public b(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 1

    iget-object v0, p0, Lcom/zzhoujay/richtext/cache/a;->a:Landroidx/collection/LruCache;

    invoke-virtual {v0, p1, p2}, Landroidx/collection/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public c(Ljava/lang/String;Lcom/zzhoujay/richtext/drawable/b;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zzhoujay/richtext/cache/a;->b:Landroidx/collection/LruCache;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Landroidx/collection/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/zzhoujay/richtext/cache/b;->b:Lcom/zzhoujay/richtext/cache/b;

    .line 7
    .line 8
    invoke-static {}, Lcom/zzhoujay/richtext/cache/a;->h()Lcom/jakewharton/disklrucache/a;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {v0, p1, p2, v1}, Lcom/zzhoujay/richtext/cache/b;->b(Ljava/lang/String;Ljava/lang/Object;Lcom/jakewharton/disklrucache/a;)V

    .line 13
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

.method public d()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zzhoujay/richtext/cache/a;->a:Landroidx/collection/LruCache;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/collection/LruCache;->evictAll()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zzhoujay/richtext/cache/a;->b:Landroidx/collection/LruCache;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/collection/LruCache;->evictAll()V

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
.end method

.method public e()V
    .locals 1

    .line 1
    :try_start_0
    invoke-static {}, Lcom/zzhoujay/richtext/cache/a;->h()Lcom/jakewharton/disklrucache/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/jakewharton/disklrucache/a;->I()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :catch_0
    move-exception v0

    .line 12
    invoke-static {v0}, Lcom/zzhoujay/richtext/ext/c;->a(Ljava/lang/Throwable;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    :goto_0
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

.method public f(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/zzhoujay/richtext/cache/a;->a:Landroidx/collection/LruCache;

    invoke-virtual {v0, p1}, Landroidx/collection/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Bitmap;

    return-object p1
.end method

.method public i(Ljava/lang/String;)Lcom/zzhoujay/richtext/drawable/b;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zzhoujay/richtext/cache/a;->b:Landroidx/collection/LruCache;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/collection/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zzhoujay/richtext/drawable/b;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Lcom/zzhoujay/richtext/cache/b;->b:Lcom/zzhoujay/richtext/cache/b;

    .line 12
    .line 13
    invoke-static {}, Lcom/zzhoujay/richtext/cache/a;->h()Lcom/jakewharton/disklrucache/a;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v0, p1, v1}, Lcom/zzhoujay/richtext/cache/b;->c(Ljava/lang/String;Lcom/jakewharton/disklrucache/a;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    move-object v0, p1

    .line 22
    check-cast v0, Lcom/zzhoujay/richtext/drawable/b;

    .line 23
    .line 24
    :cond_0
    return-object v0
    .line 25
    .line 26
    .line 27
.end method

.method public l(Ljava/lang/String;)Z
    .locals 2

    sget-object v0, Lcom/zzhoujay/richtext/cache/b;->c:Lcom/zzhoujay/richtext/cache/b;

    invoke-static {}, Lcom/zzhoujay/richtext/cache/a;->j()Lcom/jakewharton/disklrucache/a;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lcom/zzhoujay/richtext/cache/b;->a(Ljava/lang/String;Lcom/jakewharton/disklrucache/a;)Z

    move-result p1

    return p1
.end method

.method public m(Ljava/lang/String;)Ljava/io/InputStream;
    .locals 2

    sget-object v0, Lcom/zzhoujay/richtext/cache/b;->c:Lcom/zzhoujay/richtext/cache/b;

    invoke-static {}, Lcom/zzhoujay/richtext/cache/a;->j()Lcom/jakewharton/disklrucache/a;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lcom/zzhoujay/richtext/cache/b;->c(Ljava/lang/String;Lcom/jakewharton/disklrucache/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/io/InputStream;

    return-object p1
.end method

.method public o(Ljava/lang/String;Ljava/io/InputStream;)V
    .locals 2

    sget-object v0, Lcom/zzhoujay/richtext/cache/b;->c:Lcom/zzhoujay/richtext/cache/b;

    invoke-static {}, Lcom/zzhoujay/richtext/cache/a;->j()Lcom/jakewharton/disklrucache/a;

    move-result-object v1

    invoke-interface {v0, p1, p2, v1}, Lcom/zzhoujay/richtext/cache/b;->b(Ljava/lang/String;Ljava/lang/Object;Lcom/jakewharton/disklrucache/a;)V

    return-void
.end method
