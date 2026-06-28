.class abstract Lcom/zzhoujay/richtext/ig/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field static a:Lcom/zzhoujay/richtext/ig/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/zzhoujay/richtext/ig/o<",
            "[B>;"
        }
    .end annotation
.end field

.field static b:Lcom/zzhoujay/richtext/ig/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/zzhoujay/richtext/ig/o<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field static c:Lcom/zzhoujay/richtext/ig/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/zzhoujay/richtext/ig/o<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zzhoujay/richtext/ig/o$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zzhoujay/richtext/ig/o$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zzhoujay/richtext/ig/o;->a:Lcom/zzhoujay/richtext/ig/o;

    .line 7
    .line 8
    new-instance v0, Lcom/zzhoujay/richtext/ig/o$b;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/zzhoujay/richtext/ig/o$b;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/zzhoujay/richtext/ig/o;->b:Lcom/zzhoujay/richtext/ig/o;

    .line 14
    .line 15
    new-instance v0, Lcom/zzhoujay/richtext/ig/o$c;

    .line 16
    .line 17
    invoke-direct {v0}, Lcom/zzhoujay/richtext/ig/o$c;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lcom/zzhoujay/richtext/ig/o;->c:Lcom/zzhoujay/richtext/ig/o;

    .line 21
    .line 22
    return-void
    .line 23
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method a(Lcom/zzhoujay/richtext/c;Ljava/lang/Object;Landroid/graphics/BitmapFactory$Options;)Lcom/zzhoujay/richtext/ig/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zzhoujay/richtext/c;",
            "TT;",
            "Landroid/graphics/BitmapFactory$Options;",
            ")",
            "Lcom/zzhoujay/richtext/ig/l;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/zzhoujay/richtext/c;->n()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/zzhoujay/richtext/c;->o()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, p2, p3}, Lcom/zzhoujay/richtext/ig/o;->e(Ljava/lang/Object;Landroid/graphics/BitmapFactory$Options;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    :cond_0
    const/4 v0, 0x1

    .line 20
    invoke-virtual {p1, v0}, Lcom/zzhoujay/richtext/c;->z(Z)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p2, p3}, Lcom/zzhoujay/richtext/ig/o;->c(Ljava/lang/Object;Landroid/graphics/BitmapFactory$Options;)Lcom/zzhoujay/richtext/ig/l;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1

    .line 28
    :cond_1
    invoke-virtual {p0, p2, p3}, Lcom/zzhoujay/richtext/ig/o;->b(Ljava/lang/Object;Landroid/graphics/BitmapFactory$Options;)Lcom/zzhoujay/richtext/ig/l;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1
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

.method abstract b(Ljava/lang/Object;Landroid/graphics/BitmapFactory$Options;)Lcom/zzhoujay/richtext/ig/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Landroid/graphics/BitmapFactory$Options;",
            ")",
            "Lcom/zzhoujay/richtext/ig/l;"
        }
    .end annotation
.end method

.method abstract c(Ljava/lang/Object;Landroid/graphics/BitmapFactory$Options;)Lcom/zzhoujay/richtext/ig/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Landroid/graphics/BitmapFactory$Options;",
            ")",
            "Lcom/zzhoujay/richtext/ig/l;"
        }
    .end annotation
.end method

.method abstract d(Ljava/lang/Object;Landroid/graphics/BitmapFactory$Options;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Landroid/graphics/BitmapFactory$Options;",
            ")V"
        }
    .end annotation
.end method

.method abstract e(Ljava/lang/Object;Landroid/graphics/BitmapFactory$Options;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Landroid/graphics/BitmapFactory$Options;",
            ")Z"
        }
    .end annotation
.end method
