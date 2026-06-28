.class Lcom/airbnb/lottie/parser/moshi/f$d$a;
.super Lcom/airbnb/lottie/parser/moshi/f$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/airbnb/lottie/parser/moshi/f$d;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/airbnb/lottie/parser/moshi/f<",
        "TK;TV;>.f<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field final synthetic e:Lcom/airbnb/lottie/parser/moshi/f$d;


# direct methods
.method constructor <init>(Lcom/airbnb/lottie/parser/moshi/f$d;)V
    .locals 0

    iput-object p1, p0, Lcom/airbnb/lottie/parser/moshi/f$d$a;->e:Lcom/airbnb/lottie/parser/moshi/f$d;

    iget-object p1, p1, Lcom/airbnb/lottie/parser/moshi/f$d;->a:Lcom/airbnb/lottie/parser/moshi/f;

    invoke-direct {p0, p1}, Lcom/airbnb/lottie/parser/moshi/f$f;-><init>(Lcom/airbnb/lottie/parser/moshi/f;)V

    return-void
.end method


# virtual methods
.method public b()Ljava/util/Map$Entry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/airbnb/lottie/parser/moshi/f$f;->a()Lcom/airbnb/lottie/parser/moshi/f$g;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/airbnb/lottie/parser/moshi/f$d$a;->b()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method
