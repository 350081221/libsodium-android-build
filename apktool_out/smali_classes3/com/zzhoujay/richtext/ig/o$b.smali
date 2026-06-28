.class final Lcom/zzhoujay/richtext/ig/o$b;
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
        "Ljava/lang/String;",
        ">;"
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

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/zzhoujay/richtext/ig/o$b;->f(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Lcom/zzhoujay/richtext/ig/l;

    move-result-object p1

    return-object p1
.end method

.method bridge synthetic c(Ljava/lang/Object;Landroid/graphics/BitmapFactory$Options;)Lcom/zzhoujay/richtext/ig/l;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/zzhoujay/richtext/ig/o$b;->g(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Lcom/zzhoujay/richtext/ig/l;

    move-result-object p1

    return-object p1
.end method

.method bridge synthetic d(Ljava/lang/Object;Landroid/graphics/BitmapFactory$Options;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/zzhoujay/richtext/ig/o$b;->h(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)V

    return-void
.end method

.method bridge synthetic e(Ljava/lang/Object;Landroid/graphics/BitmapFactory$Options;)Z
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/zzhoujay/richtext/ig/o$b;->i(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Z

    move-result p1

    return p1
.end method

.method public f(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Lcom/zzhoujay/richtext/ig/l;
    .locals 0

    invoke-static {p1, p2}, Lcom/huawei/agconnect/apms/instrument/BitmapFactoryInstrumentation;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-static {p1}, Lcom/zzhoujay/richtext/ig/l;->a(Landroid/graphics/Bitmap;)Lcom/zzhoujay/richtext/ig/l;

    move-result-object p1

    return-object p1
.end method

.method g(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Lcom/zzhoujay/richtext/ig/l;
    .locals 2

    new-instance v0, Lcom/zzhoujay/richtext/drawable/d;

    invoke-static {p1}, Landroid/graphics/Movie;->decodeFile(Ljava/lang/String;)Landroid/graphics/Movie;

    move-result-object p1

    iget v1, p2, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    iget p2, p2, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    invoke-direct {v0, p1, v1, p2}, Lcom/zzhoujay/richtext/drawable/d;-><init>(Landroid/graphics/Movie;II)V

    invoke-static {v0}, Lcom/zzhoujay/richtext/ig/l;->d(Lcom/zzhoujay/richtext/drawable/d;)Lcom/zzhoujay/richtext/ig/l;

    move-result-object p1

    return-object p1
.end method

.method h(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)V
    .locals 0

    invoke-static {p1, p2}, Lcom/huawei/agconnect/apms/instrument/BitmapFactoryInstrumentation;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    return-void
.end method

.method i(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Z
    .locals 0

    invoke-static {p1}, Lcom/zzhoujay/richtext/ext/e;->c(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
