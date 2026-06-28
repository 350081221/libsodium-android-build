.class public abstract Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;
.super Lorg/osmdroid/tileprovider/tilesource/a;
.source "SourceFile"


# instance fields
.field private final mBaseUrls:[Ljava/lang/String;

.field private final mSemaphore:Ljava/util/concurrent/Semaphore;

.field private final mTileSourcePolicy:Lorg/osmdroid/tileprovider/tilesource/j;


# direct methods
.method public constructor <init>(Ljava/lang/String;IIILjava/lang/String;[Ljava/lang/String;)V
    .locals 8

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    move-object v6, p6

    .line 1
    invoke-direct/range {v0 .. v7}, Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;-><init>(Ljava/lang/String;IIILjava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IIILjava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    .line 2
    new-instance v8, Lorg/osmdroid/tileprovider/tilesource/j;

    invoke-direct {v8}, Lorg/osmdroid/tileprovider/tilesource/j;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;-><init>(Ljava/lang/String;IIILjava/lang/String;[Ljava/lang/String;Ljava/lang/String;Lorg/osmdroid/tileprovider/tilesource/j;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IIILjava/lang/String;[Ljava/lang/String;Ljava/lang/String;Lorg/osmdroid/tileprovider/tilesource/j;)V
    .locals 7

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    move-object v6, p7

    .line 3
    invoke-direct/range {v0 .. v6}, Lorg/osmdroid/tileprovider/tilesource/a;-><init>(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V

    .line 4
    iput-object p6, p0, Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;->mBaseUrls:[Ljava/lang/String;

    .line 5
    iput-object p8, p0, Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;->mTileSourcePolicy:Lorg/osmdroid/tileprovider/tilesource/j;

    .line 6
    invoke-virtual {p8}, Lorg/osmdroid/tileprovider/tilesource/j;->i()I

    move-result p1

    if-lez p1, :cond_0

    .line 7
    new-instance p1, Ljava/util/concurrent/Semaphore;

    invoke-virtual {p8}, Lorg/osmdroid/tileprovider/tilesource/j;->i()I

    move-result p2

    const/4 p3, 0x1

    invoke-direct {p1, p2, p3}, Ljava/util/concurrent/Semaphore;-><init>(IZ)V

    iput-object p1, p0, Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;->mSemaphore:Ljava/util/concurrent/Semaphore;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 8
    iput-object p1, p0, Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;->mSemaphore:Ljava/util/concurrent/Semaphore;

    :goto_0
    return-void
.end method


# virtual methods
.method public acquire()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;->mSemaphore:Ljava/util/concurrent/Semaphore;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->acquire()V

    .line 7
    .line 8
    .line 9
    return-void
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
.end method

.method public getBaseUrl()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;->mBaseUrls:[Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    array-length v1, v0

    .line 6
    if-lez v1, :cond_0

    .line 7
    .line 8
    iget-object v1, p0, Lorg/osmdroid/tileprovider/tilesource/a;->random:Ljava/util/Random;

    .line 9
    .line 10
    array-length v2, v0

    .line 11
    invoke-virtual {v1, v2}, Ljava/util/Random;->nextInt(I)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    aget-object v0, v0, v1

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    const-string v0, ""

    .line 19
    .line 20
    return-object v0
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
.end method

.method public getTileSourcePolicy()Lorg/osmdroid/tileprovider/tilesource/j;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;->mTileSourcePolicy:Lorg/osmdroid/tileprovider/tilesource/j;

    return-object v0
.end method

.method public abstract getTileURLString(J)Ljava/lang/String;
.end method

.method public release()V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;->mSemaphore:Ljava/util/concurrent/Semaphore;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    .line 7
    .line 8
    .line 9
    return-void
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
.end method
