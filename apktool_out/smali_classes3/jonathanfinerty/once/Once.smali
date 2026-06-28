.class public Ljonathanfinerty/once/Once;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljonathanfinerty/once/Once$Scope;
    }
.end annotation


# static fields
.field public static final THIS_APP_INSTALL:I = 0x0

.field public static final THIS_APP_SESSION:I = 0x2

.field public static final THIS_APP_VERSION:I = 0x1

.field private static a:J = -0x1L

.field private static b:Ljonathanfinerty/once/PersistedMap;

.field private static c:Ljonathanfinerty/once/PersistedSet;

.field private static d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static beenDone(ILjava/lang/String;)Z
    .locals 1

    const/4 v0, 0x0

    .line 3
    invoke-static {v0}, Ljonathanfinerty/once/Amount;->moreThan(I)Ljonathanfinerty/once/CountChecker;

    move-result-object v0

    invoke-static {p0, p1, v0}, Ljonathanfinerty/once/Once;->beenDone(ILjava/lang/String;Ljonathanfinerty/once/CountChecker;)Z

    move-result p0

    return p0
.end method

.method public static beenDone(ILjava/lang/String;Ljonathanfinerty/once/CountChecker;)Z
    .locals 5

    .line 4
    sget-object v0, Ljonathanfinerty/once/Once;->b:Ljonathanfinerty/once/PersistedMap;

    invoke-virtual {v0, p1}, Ljonathanfinerty/once/PersistedMap;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return v2

    :cond_0
    if-eqz p0, :cond_6

    const/4 v1, 0x2

    if-eq p0, v1, :cond_3

    .line 6
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    .line 7
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    sget-wide v3, Ljonathanfinerty/once/Once;->a:J

    cmp-long p1, v0, v3

    if-lez p1, :cond_1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 8
    :cond_2
    invoke-interface {p2, v2}, Ljonathanfinerty/once/CountChecker;->check(I)Z

    move-result p0

    return p0

    .line 9
    :cond_3
    sget-object p0, Ljonathanfinerty/once/Once;->d:Ljava/util/ArrayList;

    new-array v0, v2, [Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/String;

    .line 10
    array-length v0, p0

    move v1, v2

    :goto_1
    if-ge v2, v0, :cond_5

    aget-object v3, p0, v2

    .line 11
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    add-int/lit8 v1, v1, 0x1

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 12
    :cond_5
    invoke-interface {p2, v1}, Ljonathanfinerty/once/CountChecker;->check(I)Z

    move-result p0

    return p0

    .line 13
    :cond_6
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p0

    invoke-interface {p2, p0}, Ljonathanfinerty/once/CountChecker;->check(I)Z

    move-result p0

    return p0
.end method

.method public static beenDone(JLjava/lang/String;)Z
    .locals 1

    const/4 v0, 0x0

    .line 17
    invoke-static {v0}, Ljonathanfinerty/once/Amount;->moreThan(I)Ljonathanfinerty/once/CountChecker;

    move-result-object v0

    invoke-static {p0, p1, p2, v0}, Ljonathanfinerty/once/Once;->beenDone(JLjava/lang/String;Ljonathanfinerty/once/CountChecker;)Z

    move-result p0

    return p0
.end method

.method public static beenDone(JLjava/lang/String;Ljonathanfinerty/once/CountChecker;)Z
    .locals 6

    .line 18
    sget-object v0, Ljonathanfinerty/once/Once;->b:Ljonathanfinerty/once/PersistedMap;

    invoke-virtual {v0, p2}, Ljonathanfinerty/once/PersistedMap;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object p2

    .line 19
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 20
    :cond_0
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    .line 21
    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    sub-long/2addr v2, p0

    .line 22
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    cmp-long v0, v4, v2

    if-lez v0, :cond_1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 23
    :cond_2
    invoke-interface {p3, v1}, Ljonathanfinerty/once/CountChecker;->check(I)Z

    move-result p0

    return p0
.end method

.method public static beenDone(Ljava/lang/String;)Z
    .locals 2

    const/4 v0, 0x0

    .line 1
    invoke-static {v0}, Ljonathanfinerty/once/Amount;->moreThan(I)Ljonathanfinerty/once/CountChecker;

    move-result-object v1

    invoke-static {v0, p0, v1}, Ljonathanfinerty/once/Once;->beenDone(ILjava/lang/String;Ljonathanfinerty/once/CountChecker;)Z

    move-result p0

    return p0
.end method

.method public static beenDone(Ljava/lang/String;Ljonathanfinerty/once/CountChecker;)Z
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-static {v0, p0, p1}, Ljonathanfinerty/once/Once;->beenDone(ILjava/lang/String;Ljonathanfinerty/once/CountChecker;)Z

    move-result p0

    return p0
.end method

.method public static beenDone(Ljava/util/concurrent/TimeUnit;JLjava/lang/String;)Z
    .locals 1

    const/4 v0, 0x0

    .line 14
    invoke-static {v0}, Ljonathanfinerty/once/Amount;->moreThan(I)Ljonathanfinerty/once/CountChecker;

    move-result-object v0

    invoke-static {p0, p1, p2, p3, v0}, Ljonathanfinerty/once/Once;->beenDone(Ljava/util/concurrent/TimeUnit;JLjava/lang/String;Ljonathanfinerty/once/CountChecker;)Z

    move-result p0

    return p0
.end method

.method public static beenDone(Ljava/util/concurrent/TimeUnit;JLjava/lang/String;Ljonathanfinerty/once/CountChecker;)Z
    .locals 0

    .line 15
    invoke-virtual {p0, p1, p2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide p0

    .line 16
    invoke-static {p0, p1, p3, p4}, Ljonathanfinerty/once/Once;->beenDone(JLjava/lang/String;Ljonathanfinerty/once/CountChecker;)Z

    move-result p0

    return p0
.end method

.method public static clearAll()V
    .locals 1

    .line 1
    sget-object v0, Ljonathanfinerty/once/Once;->b:Ljonathanfinerty/once/PersistedMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljonathanfinerty/once/PersistedMap;->a()V

    .line 4
    .line 5
    .line 6
    sget-object v0, Ljonathanfinerty/once/Once;->d:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

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

.method public static clearAllToDos()V
    .locals 1

    sget-object v0, Ljonathanfinerty/once/Once;->c:Ljonathanfinerty/once/PersistedSet;

    invoke-virtual {v0}, Ljonathanfinerty/once/PersistedSet;->a()V

    return-void
.end method

.method public static clearDone(Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Ljonathanfinerty/once/Once;->b:Ljonathanfinerty/once/PersistedMap;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljonathanfinerty/once/PersistedMap;->f(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Ljonathanfinerty/once/Once;->d:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

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

.method public static clearToDo(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Ljonathanfinerty/once/Once;->c:Ljonathanfinerty/once/PersistedSet;

    invoke-virtual {v0, p0}, Ljonathanfinerty/once/PersistedSet;->d(Ljava/lang/String;)V

    return-void
.end method

.method public static initialise(Landroid/content/Context;)V
    .locals 2

    .line 1
    new-instance v0, Ljonathanfinerty/once/PersistedMap;

    .line 2
    .line 3
    const-string v1, "TagLastSeenMap"

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Ljonathanfinerty/once/PersistedMap;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Ljonathanfinerty/once/Once;->b:Ljonathanfinerty/once/PersistedMap;

    .line 9
    .line 10
    new-instance v0, Ljonathanfinerty/once/PersistedSet;

    .line 11
    .line 12
    const-string v1, "ToDoSet"

    .line 13
    .line 14
    invoke-direct {v0, p0, v1}, Ljonathanfinerty/once/PersistedSet;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Ljonathanfinerty/once/Once;->c:Ljonathanfinerty/once/PersistedSet;

    .line 18
    .line 19
    sget-object v0, Ljonathanfinerty/once/Once;->d:Ljava/util/ArrayList;

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    new-instance v0, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    sput-object v0, Ljonathanfinerty/once/Once;->d:Ljava/util/ArrayList;

    .line 29
    .line 30
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    const/4 v1, 0x0

    .line 39
    invoke-virtual {v0, p0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    iget-wide v0, p0, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    .line 44
    .line 45
    sput-wide v0, Ljonathanfinerty/once/Once;->a:J
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    .line 47
    :catch_0
    return-void
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

.method public static lastDone(Ljava/lang/String;)Ljava/util/Date;
    .locals 2
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    sget-object v0, Ljonathanfinerty/once/Once;->b:Ljonathanfinerty/once/PersistedMap;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljonathanfinerty/once/PersistedMap;->b(Ljava/lang/String;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return-object p0

    .line 15
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    add-int/lit8 v0, v0, -0x1

    .line 20
    .line 21
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Ljava/lang/Long;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    new-instance p0, Ljava/util/Date;

    .line 32
    .line 33
    invoke-direct {p0, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 34
    .line 35
    .line 36
    return-object p0
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

.method public static markDone(Ljava/lang/String;)V
    .locals 3

    .line 1
    sget-object v0, Ljonathanfinerty/once/Once;->b:Ljonathanfinerty/once/PersistedMap;

    .line 2
    .line 3
    new-instance v1, Ljava/util/Date;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    invoke-virtual {v0, p0, v1, v2}, Ljonathanfinerty/once/PersistedMap;->e(Ljava/lang/String;J)V

    .line 13
    .line 14
    .line 15
    sget-object v0, Ljonathanfinerty/once/Once;->d:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    sget-object v0, Ljonathanfinerty/once/Once;->c:Ljonathanfinerty/once/PersistedSet;

    .line 21
    .line 22
    invoke-virtual {v0, p0}, Ljonathanfinerty/once/PersistedSet;->d(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void
    .line 26
    .line 27
.end method

.method public static needToDo(Ljava/lang/String;)Z
    .locals 1

    sget-object v0, Ljonathanfinerty/once/Once;->c:Ljonathanfinerty/once/PersistedSet;

    invoke-virtual {v0, p0}, Ljonathanfinerty/once/PersistedSet;->b(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static toDo(ILjava/lang/String;)V
    .locals 4

    .line 1
    sget-object v0, Ljonathanfinerty/once/Once;->b:Ljonathanfinerty/once/PersistedMap;

    invoke-virtual {v0, p1}, Ljonathanfinerty/once/PersistedMap;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 2
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    sget-object p0, Ljonathanfinerty/once/Once;->c:Ljonathanfinerty/once/PersistedSet;

    invoke-virtual {p0, p1}, Ljonathanfinerty/once/PersistedSet;->c(Ljava/lang/String;)V

    return-void

    .line 4
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    if-ne p0, v2, :cond_1

    .line 5
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    sget-wide v2, Ljonathanfinerty/once/Once;->a:J

    cmp-long p0, v0, v2

    if-gtz p0, :cond_1

    .line 6
    sget-object p0, Ljonathanfinerty/once/Once;->c:Ljonathanfinerty/once/PersistedSet;

    invoke-virtual {p0, p1}, Ljonathanfinerty/once/PersistedSet;->c(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public static toDo(Ljava/lang/String;)V
    .locals 1

    .line 7
    sget-object v0, Ljonathanfinerty/once/Once;->c:Ljonathanfinerty/once/PersistedSet;

    invoke-virtual {v0, p0}, Ljonathanfinerty/once/PersistedSet;->c(Ljava/lang/String;)V

    return-void
.end method
