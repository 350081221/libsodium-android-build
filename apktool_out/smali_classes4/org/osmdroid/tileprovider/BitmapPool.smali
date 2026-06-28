.class public Lorg/osmdroid/tileprovider/BitmapPool;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final sInstance:Lorg/osmdroid/tileprovider/BitmapPool;


# instance fields
.field private final mExecutor:Ljava/util/concurrent/ExecutorService;

.field private final mPool:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/osmdroid/tileprovider/BitmapPool;

    invoke-direct {v0}, Lorg/osmdroid/tileprovider/BitmapPool;-><init>()V

    sput-object v0, Lorg/osmdroid/tileprovider/BitmapPool;->sInstance:Lorg/osmdroid/tileprovider/BitmapPool;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lorg/osmdroid/tileprovider/BitmapPool;->mPool:Ljava/util/LinkedList;

    .line 10
    .line 11
    new-instance v0, Lorg/osmdroid/tileprovider/modules/ConfigurablePriorityThreadFactory;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-direct {v0, v2, v1}, Lorg/osmdroid/tileprovider/modules/ConfigurablePriorityThreadFactory;-><init>(ILjava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v2, v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, Lorg/osmdroid/tileprovider/BitmapPool;->mExecutor:Ljava/util/concurrent/ExecutorService;

    .line 30
    .line 31
    return-void
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
.end method

.method static synthetic access$000(Lorg/osmdroid/tileprovider/BitmapPool;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-direct {p0, p1}, Lorg/osmdroid/tileprovider/BitmapPool;->syncRecycle(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public static getInstance()Lorg/osmdroid/tileprovider/BitmapPool;
    .locals 1

    sget-object v0, Lorg/osmdroid/tileprovider/BitmapPool;->sInstance:Lorg/osmdroid/tileprovider/BitmapPool;

    return-object v0
.end method

.method private syncRecycle(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    instance-of v0, p1, Lorg/osmdroid/tileprovider/ReusableBitmapDrawable;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    check-cast p1, Lorg/osmdroid/tileprovider/ReusableBitmapDrawable;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lorg/osmdroid/tileprovider/BitmapPool;->returnDrawableToPool(Lorg/osmdroid/tileprovider/ReusableBitmapDrawable;)V

    .line 11
    .line 12
    .line 13
    :cond_1
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
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method


# virtual methods
.method public applyReusableOptions(Landroid/graphics/BitmapFactory$Options;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    .line 1
    iput-object v0, p1, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;

    const/4 v0, 0x1

    .line 2
    iput v0, p1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 3
    iput-boolean v0, p1, Landroid/graphics/BitmapFactory$Options;->inMutable:Z

    return-void
.end method

.method public applyReusableOptions(Landroid/graphics/BitmapFactory$Options;II)V
    .locals 0

    .line 4
    invoke-virtual {p0, p2, p3}, Lorg/osmdroid/tileprovider/BitmapPool;->obtainSizedBitmapFromPool(II)Landroid/graphics/Bitmap;

    move-result-object p2

    iput-object p2, p1, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;

    const/4 p2, 0x1

    .line 5
    iput p2, p1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 6
    iput-boolean p2, p1, Landroid/graphics/BitmapFactory$Options;->inMutable:Z

    return-void
.end method

.method public asyncRecycle(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lorg/osmdroid/tileprovider/BitmapPool;->mExecutor:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lorg/osmdroid/tileprovider/BitmapPool$1;

    invoke-direct {v1, p0, p1}, Lorg/osmdroid/tileprovider/BitmapPool$1;-><init>(Lorg/osmdroid/tileprovider/BitmapPool;Landroid/graphics/drawable/Drawable;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public clearBitmapPool()V
    .locals 3

    .line 1
    sget-object v0, Lorg/osmdroid/tileprovider/BitmapPool;->sInstance:Lorg/osmdroid/tileprovider/BitmapPool;

    .line 2
    .line 3
    iget-object v0, v0, Lorg/osmdroid/tileprovider/BitmapPool;->mPool:Ljava/util/LinkedList;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :goto_0
    :try_start_0
    sget-object v1, Lorg/osmdroid/tileprovider/BitmapPool;->sInstance:Lorg/osmdroid/tileprovider/BitmapPool;

    .line 7
    .line 8
    iget-object v2, v1, Lorg/osmdroid/tileprovider/BitmapPool;->mPool:Ljava/util/LinkedList;

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    iget-object v1, v1, Lorg/osmdroid/tileprovider/BitmapPool;->mPool:Ljava/util/LinkedList;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/util/LinkedList;->remove()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Landroid/graphics/Bitmap;

    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    monitor-exit v0

    .line 29
    return-void

    .line 30
    :catchall_0
    move-exception v1

    .line 31
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    throw v1
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
.end method

.method public obtainBitmapFromPool()Landroid/graphics/Bitmap;
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/osmdroid/tileprovider/BitmapPool;->mPool:Ljava/util/LinkedList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lorg/osmdroid/tileprovider/BitmapPool;->mPool:Ljava/util/LinkedList;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    const/4 v0, 0x0

    .line 14
    return-object v0

    .line 15
    :cond_0
    iget-object v1, p0, Lorg/osmdroid/tileprovider/BitmapPool;->mPool:Ljava/util/LinkedList;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Landroid/graphics/Bitmap;

    .line 22
    .line 23
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0}, Lorg/osmdroid/tileprovider/BitmapPool;->obtainBitmapFromPool()Landroid/graphics/Bitmap;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    monitor-exit v0

    .line 34
    return-object v1

    .line 35
    :cond_1
    monitor-exit v0

    .line 36
    return-object v1

    .line 37
    :catchall_0
    move-exception v1

    .line 38
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    throw v1
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public obtainSizedBitmapFromPool(II)Landroid/graphics/Bitmap;
    .locals 5

    .line 1
    iget-object v0, p0, Lorg/osmdroid/tileprovider/BitmapPool;->mPool:Ljava/util/LinkedList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lorg/osmdroid/tileprovider/BitmapPool;->mPool:Ljava/util/LinkedList;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    monitor-exit v0

    .line 14
    return-object v2

    .line 15
    :cond_0
    iget-object v1, p0, Lorg/osmdroid/tileprovider/BitmapPool;->mPool:Ljava/util/LinkedList;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_3

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Landroid/graphics/Bitmap;

    .line 32
    .line 33
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_2

    .line 38
    .line 39
    iget-object v1, p0, Lorg/osmdroid/tileprovider/BitmapPool;->mPool:Ljava/util/LinkedList;

    .line 40
    .line 41
    invoke-virtual {v1, v3}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, Lorg/osmdroid/tileprovider/BitmapPool;->obtainSizedBitmapFromPool(II)Landroid/graphics/Bitmap;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    monitor-exit v0

    .line 49
    return-object p1

    .line 50
    :cond_2
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-ne v4, p1, :cond_1

    .line 55
    .line 56
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-ne v4, p2, :cond_1

    .line 61
    .line 62
    iget-object p1, p0, Lorg/osmdroid/tileprovider/BitmapPool;->mPool:Ljava/util/LinkedList;

    .line 63
    .line 64
    invoke-virtual {p1, v3}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    monitor-exit v0

    .line 68
    return-object v3

    .line 69
    :cond_3
    monitor-exit v0

    .line 70
    return-object v2

    .line 71
    :catchall_0
    move-exception p1

    .line 72
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    throw p1
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
.end method

.method public returnDrawableToPool(Lorg/osmdroid/tileprovider/ReusableBitmapDrawable;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lorg/osmdroid/tileprovider/ReusableBitmapDrawable;->tryRecycle()Landroid/graphics/Bitmap;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isMutable()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object v0, p0, Lorg/osmdroid/tileprovider/BitmapPool;->mPool:Ljava/util/LinkedList;

    .line 26
    .line 27
    monitor-enter v0

    .line 28
    :try_start_0
    iget-object v1, p0, Lorg/osmdroid/tileprovider/BitmapPool;->mPool:Ljava/util/LinkedList;

    .line 29
    .line 30
    invoke-virtual {v1, p1}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    monitor-exit v0

    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p1

    .line 36
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    throw p1

    .line 38
    :cond_0
    if-eqz p1, :cond_1

    .line 39
    .line 40
    const-string p1, "OsmDroid"

    .line 41
    .line 42
    const-string v0, "Rejected bitmap from being added to BitmapPool."

    .line 43
    .line 44
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    :cond_1
    :goto_0
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
.end method
