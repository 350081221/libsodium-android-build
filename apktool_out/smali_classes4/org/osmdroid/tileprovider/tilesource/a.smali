.class public abstract Lorg/osmdroid/tileprovider/tilesource/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/osmdroid/tileprovider/tilesource/e;


# annotations
.annotation build Lcom/huawei/agconnect/apms/instrument/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/osmdroid/tileprovider/tilesource/a$a;
    }
.end annotation


# static fields
.field private static globalOrdinal:I


# instance fields
.field protected mCopyright:Ljava/lang/String;

.field protected final mImageFilenameEnding:Ljava/lang/String;

.field private final mMaximumZoomLevel:I

.field private final mMinimumZoomLevel:I

.field protected mName:Ljava/lang/String;

.field private final mOrdinal:I

.field private final mTileSizePixels:I

.field protected final random:Ljava/util/Random;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IIILjava/lang/String;)V
    .locals 7

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    .line 1
    invoke-direct/range {v0 .. v6}, Lorg/osmdroid/tileprovider/tilesource/a;-><init>(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/tileprovider/tilesource/a;->random:Ljava/util/Random;

    .line 4
    sget v0, Lorg/osmdroid/tileprovider/tilesource/a;->globalOrdinal:I

    add-int/lit8 v1, v0, 0x1

    sput v1, Lorg/osmdroid/tileprovider/tilesource/a;->globalOrdinal:I

    iput v0, p0, Lorg/osmdroid/tileprovider/tilesource/a;->mOrdinal:I

    .line 5
    iput-object p1, p0, Lorg/osmdroid/tileprovider/tilesource/a;->mName:Ljava/lang/String;

    .line 6
    iput p2, p0, Lorg/osmdroid/tileprovider/tilesource/a;->mMinimumZoomLevel:I

    .line 7
    iput p3, p0, Lorg/osmdroid/tileprovider/tilesource/a;->mMaximumZoomLevel:I

    .line 8
    iput p4, p0, Lorg/osmdroid/tileprovider/tilesource/a;->mTileSizePixels:I

    .line 9
    iput-object p5, p0, Lorg/osmdroid/tileprovider/tilesource/a;->mImageFilenameEnding:Ljava/lang/String;

    .line 10
    iput-object p6, p0, Lorg/osmdroid/tileprovider/tilesource/a;->mCopyright:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getCopyrightNotice()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/tileprovider/tilesource/a;->mCopyright:Ljava/lang/String;

    return-object v0
.end method

.method public getDrawable(Ljava/io/InputStream;)Landroid/graphics/drawable/Drawable;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/osmdroid/tileprovider/tilesource/a$a;
        }
    .end annotation

    const-string v0, "OsmDroid"

    const/4 v1, 0x0

    .line 21
    :try_start_0
    iget v2, p0, Lorg/osmdroid/tileprovider/tilesource/a;->mTileSizePixels:I

    .line 22
    invoke-virtual {p1}, Ljava/io/InputStream;->markSupported()Z

    move-result v3

    if-eqz v3, :cond_0

    const/high16 v2, 0x100000

    .line 23
    invoke-virtual {p1, v2}, Ljava/io/InputStream;->mark(I)V

    .line 24
    new-instance v2, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v2}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    const/4 v3, 0x1

    .line 25
    iput-boolean v3, v2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 26
    invoke-static {p1, v1, v2}, Lcom/huawei/agconnect/apms/instrument/BitmapFactoryInstrumentation;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 27
    iget v2, v2, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 28
    invoke-virtual {p1}, Ljava/io/InputStream;->reset()V

    .line 29
    :cond_0
    new-instance v3, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v3}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 30
    invoke-static {}, Lorg/osmdroid/tileprovider/BitmapPool;->getInstance()Lorg/osmdroid/tileprovider/BitmapPool;

    move-result-object v4

    invoke-virtual {v4, v3, v2, v2}, Lorg/osmdroid/tileprovider/BitmapPool;->applyReusableOptions(Landroid/graphics/BitmapFactory$Options;II)V

    .line 31
    invoke-static {p1, v1, v3}, Lcom/huawei/agconnect/apms/instrument/BitmapFactoryInstrumentation;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 32
    new-instance v2, Lorg/osmdroid/tileprovider/ReusableBitmapDrawable;

    invoke-direct {v2, p1}, Lorg/osmdroid/tileprovider/ReusableBitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    move-exception p1

    .line 33
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "#547 Error loading bitmap"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/osmdroid/tileprovider/tilesource/a;->pathBase()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_1
    return-object v1

    :catch_1
    move-exception p1

    const-string v1, "OutOfMemoryError loading bitmap"

    .line 34
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 35
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 36
    new-instance v0, Lorg/osmdroid/tileprovider/tilesource/a$a;

    invoke-direct {v0, p1}, Lorg/osmdroid/tileprovider/tilesource/a$a;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public getDrawable(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/osmdroid/tileprovider/tilesource/a$a;
        }
    .end annotation

    const-string v0, "OsmDroid"

    const/4 v1, 0x1

    .line 1
    :try_start_0
    new-instance v2, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v2}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 2
    iput-boolean v1, v2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 3
    invoke-static {p1, v2}, Lcom/huawei/agconnect/apms/instrument/BitmapFactoryInstrumentation;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 4
    iget v2, v2, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 5
    new-instance v3, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v3}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 6
    invoke-static {}, Lorg/osmdroid/tileprovider/BitmapPool;->getInstance()Lorg/osmdroid/tileprovider/BitmapPool;

    move-result-object v4

    invoke-virtual {v4, v3, v2, v2}, Lorg/osmdroid/tileprovider/BitmapPool;->applyReusableOptions(Landroid/graphics/BitmapFactory$Options;II)V

    .line 7
    invoke-static {p1, v3}, Lcom/huawei/agconnect/apms/instrument/BitmapFactoryInstrumentation;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 8
    new-instance v3, Lorg/osmdroid/tileprovider/ReusableBitmapDrawable;

    invoke-direct {v3, v2}, Lorg/osmdroid/tileprovider/ReusableBitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V

    return-object v3

    .line 9
    :cond_0
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 10
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 11
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " is an invalid image file, deleting..."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    :try_start_1
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->delete()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    .line 13
    :try_start_2
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Error deleting invalid file: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 14
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Request tile: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " does not exist"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    .line 15
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unexpected error loading bitmap: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 16
    sget p1, Lorg/osmdroid/tileprovider/util/Counters;->tileDownloadErrors:I

    add-int/2addr p1, v1

    sput p1, Lorg/osmdroid/tileprovider/util/Counters;->tileDownloadErrors:I

    .line 17
    invoke-static {}, Ljava/lang/System;->gc()V

    :goto_0
    const/4 p1, 0x0

    return-object p1

    :catch_1
    move-exception v1

    .line 18
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "OutOfMemoryError loading bitmap: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 19
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 20
    new-instance p1, Lorg/osmdroid/tileprovider/tilesource/a$a;

    invoke-direct {p1, v1}, Lorg/osmdroid/tileprovider/tilesource/a$a;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public getMaximumZoomLevel()I
    .locals 1

    iget v0, p0, Lorg/osmdroid/tileprovider/tilesource/a;->mMaximumZoomLevel:I

    return v0
.end method

.method public getMinimumZoomLevel()I
    .locals 1

    iget v0, p0, Lorg/osmdroid/tileprovider/tilesource/a;->mMinimumZoomLevel:I

    return v0
.end method

.method public getTileRelativeFilenameString(J)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lorg/osmdroid/tileprovider/tilesource/a;->pathBase()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 v1, 0x2f

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-static {p1, p2}, Lorg/osmdroid/util/MapTileIndex;->getZoom(J)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-static {p1, p2}, Lorg/osmdroid/util/MapTileIndex;->getX(J)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-static {p1, p2}, Lorg/osmdroid/util/MapTileIndex;->getY(J)I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lorg/osmdroid/tileprovider/tilesource/a;->imageFilenameEnding()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    return-object p1
    .line 57
    .line 58
.end method

.method public getTileSizePixels()I
    .locals 1

    iget v0, p0, Lorg/osmdroid/tileprovider/tilesource/a;->mTileSizePixels:I

    return v0
.end method

.method public imageFilenameEnding()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/tileprovider/tilesource/a;->mImageFilenameEnding:Ljava/lang/String;

    return-object v0
.end method

.method public name()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/tileprovider/tilesource/a;->mName:Ljava/lang/String;

    return-object v0
.end method

.method public ordinal()I
    .locals 1

    iget v0, p0, Lorg/osmdroid/tileprovider/tilesource/a;->mOrdinal:I

    return v0
.end method

.method public pathBase()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/tileprovider/tilesource/a;->mName:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lorg/osmdroid/tileprovider/tilesource/a;->name()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
