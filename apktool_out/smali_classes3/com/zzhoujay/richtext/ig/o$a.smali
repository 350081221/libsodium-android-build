.class final Lcom/zzhoujay/richtext/ig/o$a;
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
        "[B>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/zzhoujay/richtext/ig/o;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic b(Ljava/lang/Object;Landroid/graphics/BitmapFactory$Options;)Lcom/zzhoujay/richtext/ig/l;
    .locals 0

    check-cast p1, [B

    invoke-virtual {p0, p1, p2}, Lcom/zzhoujay/richtext/ig/o$a;->f([BLandroid/graphics/BitmapFactory$Options;)Lcom/zzhoujay/richtext/ig/l;

    move-result-object p1

    return-object p1
.end method

.method bridge synthetic c(Ljava/lang/Object;Landroid/graphics/BitmapFactory$Options;)Lcom/zzhoujay/richtext/ig/l;
    .locals 0

    check-cast p1, [B

    invoke-virtual {p0, p1, p2}, Lcom/zzhoujay/richtext/ig/o$a;->g([BLandroid/graphics/BitmapFactory$Options;)Lcom/zzhoujay/richtext/ig/l;

    move-result-object p1

    return-object p1
.end method

.method bridge synthetic d(Ljava/lang/Object;Landroid/graphics/BitmapFactory$Options;)V
    .locals 0

    check-cast p1, [B

    invoke-virtual {p0, p1, p2}, Lcom/zzhoujay/richtext/ig/o$a;->h([BLandroid/graphics/BitmapFactory$Options;)V

    return-void
.end method

.method bridge synthetic e(Ljava/lang/Object;Landroid/graphics/BitmapFactory$Options;)Z
    .locals 0

    check-cast p1, [B

    invoke-virtual {p0, p1, p2}, Lcom/zzhoujay/richtext/ig/o$a;->i([BLandroid/graphics/BitmapFactory$Options;)Z

    move-result p1

    return p1
.end method

.method public f([BLandroid/graphics/BitmapFactory$Options;)Lcom/zzhoujay/richtext/ig/l;
    .locals 2

    array-length v0, p1

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, p2}, Lcom/huawei/agconnect/apms/instrument/BitmapFactoryInstrumentation;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-static {p1}, Lcom/zzhoujay/richtext/ig/l;->a(Landroid/graphics/Bitmap;)Lcom/zzhoujay/richtext/ig/l;

    move-result-object p1

    return-object p1
.end method

.method g([BLandroid/graphics/BitmapFactory$Options;)Lcom/zzhoujay/richtext/ig/l;
    .locals 3

    new-instance v0, Lcom/zzhoujay/richtext/drawable/d;

    array-length v1, p1

    const/4 v2, 0x0

    invoke-static {p1, v2, v1}, Landroid/graphics/Movie;->decodeByteArray([BII)Landroid/graphics/Movie;

    move-result-object p1

    iget v1, p2, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    iget p2, p2, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    invoke-direct {v0, p1, v1, p2}, Lcom/zzhoujay/richtext/drawable/d;-><init>(Landroid/graphics/Movie;II)V

    invoke-static {v0}, Lcom/zzhoujay/richtext/ig/l;->d(Lcom/zzhoujay/richtext/drawable/d;)Lcom/zzhoujay/richtext/ig/l;

    move-result-object p1

    return-object p1
.end method

.method h([BLandroid/graphics/BitmapFactory$Options;)V
    .locals 2

    array-length v0, p1

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, p2}, Lcom/huawei/agconnect/apms/instrument/BitmapFactoryInstrumentation;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    return-void
.end method

.method i([BLandroid/graphics/BitmapFactory$Options;)Z
    .locals 0

    invoke-static {p1}, Lcom/zzhoujay/richtext/ext/e;->d([B)Z

    move-result p1

    return p1
.end method
