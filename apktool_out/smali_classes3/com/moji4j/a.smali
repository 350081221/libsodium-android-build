.class Lcom/moji4j/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final c:Ljava/lang/String; = "/romaji_to_katakana.csv"

.field private static final d:Ljava/lang/String; = "/romaji_to_hiragana.csv"

.field private static final e:Ljava/lang/String; = "/kana_to_romaji.csv"

.field private static f:Lcom/moji4j/a;

.field private static g:Lcom/moji4j/a;

.field private static h:Lcom/moji4j/a;


# instance fields
.field private a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private b:I


# direct methods
.method private constructor <init>(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/moji4j/a;->a:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    iget v2, p0, Lcom/moji4j/a;->b:I

    .line 31
    .line 32
    if-le v1, v2, :cond_0

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iput v0, p0, Lcom/moji4j/a;->b:I

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
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
.end method

.method private static a(Ljava/lang/String;)Lcom/moji4j/a;
    .locals 5

    .line 1
    const-class v0, Lcom/moji4j/a;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/Class;->getResource(Ljava/lang/String;)Ljava/net/URL;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    :try_start_0
    invoke-virtual {p0}, Ljava/net/URL;->openStream()Ljava/io/InputStream;

    .line 8
    .line 9
    .line 10
    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    :try_start_1
    new-instance v0, Ljava/io/BufferedReader;

    .line 12
    .line 13
    new-instance v1, Ljava/io/InputStreamReader;

    .line 14
    .line 15
    invoke-direct {v1, p0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 19
    .line 20
    .line 21
    new-instance v1, Ljava/util/TreeMap;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/util/TreeMap;-><init>()V

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    const/16 v3, 0x2c

    .line 33
    .line 34
    invoke-virtual {v2, v3}, Ljava/lang/String;->indexOf(I)I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    const/4 v4, 0x0

    .line 39
    invoke-virtual {v2, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    add-int/lit8 v3, v3, 0x1

    .line 44
    .line 45
    invoke-virtual {v2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-interface {v1, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    new-instance v0, Lcom/moji4j/a;

    .line 54
    .line 55
    invoke-direct {v0, v1}, Lcom/moji4j/a;-><init>(Ljava/util/Map;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    .line 57
    .line 58
    if-eqz p0, :cond_1

    .line 59
    .line 60
    :try_start_2
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 61
    .line 62
    .line 63
    :cond_1
    return-object v0

    .line 64
    :catchall_0
    move-exception v0

    .line 65
    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 66
    :catchall_1
    move-exception v1

    .line 67
    if-eqz p0, :cond_2

    .line 68
    .line 69
    :try_start_4
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :catchall_2
    move-exception p0

    .line 74
    :try_start_5
    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    :cond_2
    :goto_1
    throw v1
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    .line 78
    :catch_0
    move-exception p0

    .line 79
    new-instance v0, Ljava/lang/RuntimeException;

    .line 80
    .line 81
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    throw v0
    .line 85
.end method

.method public static declared-synchronized c()Lcom/moji4j/a;
    .locals 2

    .line 1
    const-class v0, Lcom/moji4j/a;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/moji4j/a;->h:Lcom/moji4j/a;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    const-string v1, "/kana_to_romaji.csv"

    .line 9
    .line 10
    invoke-static {v1}, Lcom/moji4j/a;->a(Ljava/lang/String;)Lcom/moji4j/a;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    sput-object v1, Lcom/moji4j/a;->h:Lcom/moji4j/a;

    .line 15
    .line 16
    :cond_0
    sget-object v1, Lcom/moji4j/a;->h:Lcom/moji4j/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    monitor-exit v0

    .line 19
    return-object v1

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    monitor-exit v0

    .line 22
    throw v1
    .line 23
.end method

.method public static declared-synchronized e()Lcom/moji4j/a;
    .locals 2

    .line 1
    const-class v0, Lcom/moji4j/a;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/moji4j/a;->g:Lcom/moji4j/a;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    const-string v1, "/romaji_to_hiragana.csv"

    .line 9
    .line 10
    invoke-static {v1}, Lcom/moji4j/a;->a(Ljava/lang/String;)Lcom/moji4j/a;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    sput-object v1, Lcom/moji4j/a;->g:Lcom/moji4j/a;

    .line 15
    .line 16
    :cond_0
    sget-object v1, Lcom/moji4j/a;->g:Lcom/moji4j/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    monitor-exit v0

    .line 19
    return-object v1

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    monitor-exit v0

    .line 22
    throw v1
    .line 23
.end method

.method public static declared-synchronized f()Lcom/moji4j/a;
    .locals 2

    .line 1
    const-class v0, Lcom/moji4j/a;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/moji4j/a;->f:Lcom/moji4j/a;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    const-string v1, "/romaji_to_katakana.csv"

    .line 9
    .line 10
    invoke-static {v1}, Lcom/moji4j/a;->a(Ljava/lang/String;)Lcom/moji4j/a;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    sput-object v1, Lcom/moji4j/a;->f:Lcom/moji4j/a;

    .line 15
    .line 16
    :cond_0
    sget-object v1, Lcom/moji4j/a;->f:Lcom/moji4j/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    monitor-exit v0

    .line 19
    return-object v1

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    monitor-exit v0

    .line 22
    throw v1
    .line 23
.end method


# virtual methods
.method b(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/moji4j/a;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method d()I
    .locals 1

    iget v0, p0, Lcom/moji4j/a;->b:I

    return v0
.end method
