.class Lorg/ccil/cowan/tagsoup/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/ccil/cowan/tagsoup/b;


# instance fields
.field private final synthetic a:Lorg/ccil/cowan/tagsoup/l;


# direct methods
.method constructor <init>(Lorg/ccil/cowan/tagsoup/l;)V
    .locals 0

    iput-object p1, p0, Lorg/ccil/cowan/tagsoup/k;->a:Lorg/ccil/cowan/tagsoup/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/io/InputStream;)Ljava/io/Reader;
    .locals 1

    new-instance v0, Ljava/io/InputStreamReader;

    invoke-direct {v0, p1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    return-object v0
.end method
