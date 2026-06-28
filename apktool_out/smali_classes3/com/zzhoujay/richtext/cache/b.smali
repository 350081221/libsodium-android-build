.class interface abstract Lcom/zzhoujay/richtext/cache/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<INPUT:",
        "Ljava/lang/Object;",
        "OUTPUT:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final a:I = 0x400

.field public static final b:Lcom/zzhoujay/richtext/cache/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/zzhoujay/richtext/cache/b<",
            "Lcom/zzhoujay/richtext/drawable/b;",
            "Lcom/zzhoujay/richtext/drawable/b;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lcom/zzhoujay/richtext/cache/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/zzhoujay/richtext/cache/b<",
            "Ljava/io/InputStream;",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zzhoujay/richtext/cache/b$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zzhoujay/richtext/cache/b$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zzhoujay/richtext/cache/b;->b:Lcom/zzhoujay/richtext/cache/b;

    .line 7
    .line 8
    new-instance v0, Lcom/zzhoujay/richtext/cache/b$b;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/zzhoujay/richtext/cache/b$b;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/zzhoujay/richtext/cache/b;->c:Lcom/zzhoujay/richtext/cache/b;

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
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;Lcom/jakewharton/disklrucache/a;)Z
.end method

.method public abstract b(Ljava/lang/String;Ljava/lang/Object;Lcom/jakewharton/disklrucache/a;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "TINPUT;",
            "Lcom/jakewharton/disklrucache/a;",
            ")V"
        }
    .end annotation
.end method

.method public abstract c(Ljava/lang/String;Lcom/jakewharton/disklrucache/a;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/jakewharton/disklrucache/a;",
            ")TOUTPUT;"
        }
    .end annotation
.end method
