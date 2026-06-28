.class final Lcom/zzhoujay/richtext/ig/o$c;
.super Lcom/zzhoujay/richtext/ig/o;
.source "SourceFile"


# annotations
.annotation build Lcom/huawei/agconnect/apms/instrument/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zzhoujay/richtext/ig/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zzhoujay/richtext/ig/o<",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# static fields
.field private static final d:I = 0x100000


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/zzhoujay/richtext/ig/o;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic b(Ljava/lang/Object;Landroid/graphics/BitmapFactory$Options;)Lcom/zzhoujay/richtext/ig/l;
    .locals 0

    check-cast p1, Ljava/io/InputStream;

    invoke-virtual {p0, p1, p2}, Lcom/zzhoujay/richtext/ig/o$c;->f(Ljava/io/InputStream;Landroid/graphics/BitmapFactory$Options;)Lcom/zzhoujay/richtext/ig/l;

    move-result-object p1

    return-object p1
.end method

.method bridge synthetic c(Ljava/lang/Object;Landroid/graphics/BitmapFactory$Options;)Lcom/zzhoujay/richtext/ig/l;
    .locals 0

    check-cast p1, Ljava/io/InputStream;

    invoke-virtual {p0, p1, p2}, Lcom/zzhoujay/richtext/ig/o$c;->g(Ljava/io/InputStream;Landroid/graphics/BitmapFactory$Options;)Lcom/zzhoujay/richtext/ig/l;

    move-result-object p1

    return-object p1
.end method

.method bridge synthetic d(Ljava/lang/Object;Landroid/graphics/BitmapFactory$Options;)V
    .locals 0

    check-cast p1, Ljava/io/InputStream;

    invoke-virtual {p0, p1, p2}, Lcom/zzhoujay/richtext/ig/o$c;->h(Ljava/io/InputStream;Landroid/graphics/BitmapFactory$Options;)V

    return-void
.end method

.method bridge synthetic e(Ljava/lang/Object;Landroid/graphics/BitmapFactory$Options;)Z
    .locals 0

    check-cast p1, Ljava/io/InputStream;

    invoke-virtual {p0, p1, p2}, Lcom/zzhoujay/richtext/ig/o$c;->i(Ljava/io/InputStream;Landroid/graphics/BitmapFactory$Options;)Z

    move-result p1

    return p1
.end method

.method public f(Ljava/io/InputStream;Landroid/graphics/BitmapFactory$Options;)Lcom/zzhoujay/richtext/ig/l;
    .locals 1

    .line 1
    instance-of v0, p1, Ljava/io/BufferedInputStream;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Ljava/io/BufferedInputStream;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, Ljava/io/BufferedInputStream;

    .line 9
    .line 10
    invoke-direct {v0, p1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 11
    .line 12
    .line 13
    move-object p1, v0

    .line 14
    :goto_0
    iget-boolean v0, p2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    const/high16 v0, 0x100000

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Ljava/io/BufferedInputStream;->mark(I)V

    .line 21
    .line 22
    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    invoke-static {p1, v0, p2}, Lcom/huawei/agconnect/apms/instrument/BitmapFactoryInstrumentation;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-boolean p2, p2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 29
    .line 30
    if-eqz p2, :cond_2

    .line 31
    .line 32
    :try_start_0
    invoke-virtual {p1}, Ljava/io/BufferedInputStream;->reset()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    .line 35
    goto :goto_1

    .line 36
    :catch_0
    move-exception p1

    .line 37
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 38
    .line 39
    .line 40
    :cond_2
    :goto_1
    invoke-static {v0}, Lcom/zzhoujay/richtext/ig/l;->a(Landroid/graphics/Bitmap;)Lcom/zzhoujay/richtext/ig/l;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method g(Ljava/io/InputStream;Landroid/graphics/BitmapFactory$Options;)Lcom/zzhoujay/richtext/ig/l;
    .locals 2

    new-instance v0, Lcom/zzhoujay/richtext/drawable/d;

    invoke-static {p1}, Landroid/graphics/Movie;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Movie;

    move-result-object p1

    iget v1, p2, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    iget p2, p2, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    invoke-direct {v0, p1, v1, p2}, Lcom/zzhoujay/richtext/drawable/d;-><init>(Landroid/graphics/Movie;II)V

    invoke-static {v0}, Lcom/zzhoujay/richtext/ig/l;->d(Lcom/zzhoujay/richtext/drawable/d;)Lcom/zzhoujay/richtext/ig/l;

    move-result-object p1

    return-object p1
.end method

.method h(Ljava/io/InputStream;Landroid/graphics/BitmapFactory$Options;)V
    .locals 1

    .line 1
    instance-of v0, p1, Ljava/io/BufferedInputStream;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Ljava/io/BufferedInputStream;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, Ljava/io/BufferedInputStream;

    .line 9
    .line 10
    invoke-direct {v0, p1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 11
    .line 12
    .line 13
    move-object p1, v0

    .line 14
    :goto_0
    iget-boolean v0, p2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    const/high16 v0, 0x100000

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Ljava/io/BufferedInputStream;->mark(I)V

    .line 21
    .line 22
    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    invoke-static {p1, v0, p2}, Lcom/huawei/agconnect/apms/instrument/BitmapFactoryInstrumentation;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 25
    .line 26
    .line 27
    iget-boolean p2, p2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 28
    .line 29
    if-eqz p2, :cond_2

    .line 30
    .line 31
    :try_start_0
    invoke-virtual {p1}, Ljava/io/BufferedInputStream;->reset()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :catch_0
    move-exception p1

    .line 36
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 37
    .line 38
    .line 39
    :cond_2
    :goto_1
    return-void
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

.method i(Ljava/io/InputStream;Landroid/graphics/BitmapFactory$Options;)Z
    .locals 0

    invoke-static {p1}, Lcom/zzhoujay/richtext/ext/e;->b(Ljava/io/InputStream;)Z

    move-result p1

    return p1
.end method
