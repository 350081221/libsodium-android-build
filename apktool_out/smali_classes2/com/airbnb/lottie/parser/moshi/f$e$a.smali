.class Lcom/airbnb/lottie/parser/moshi/f$e$a;
.super Lcom/airbnb/lottie/parser/moshi/f$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/airbnb/lottie/parser/moshi/f$e;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/airbnb/lottie/parser/moshi/f<",
        "TK;TV;>.f<TK;>;"
    }
.end annotation


# instance fields
.field final synthetic e:Lcom/airbnb/lottie/parser/moshi/f$e;


# direct methods
.method constructor <init>(Lcom/airbnb/lottie/parser/moshi/f$e;)V
    .locals 0

    iput-object p1, p0, Lcom/airbnb/lottie/parser/moshi/f$e$a;->e:Lcom/airbnb/lottie/parser/moshi/f$e;

    iget-object p1, p1, Lcom/airbnb/lottie/parser/moshi/f$e;->a:Lcom/airbnb/lottie/parser/moshi/f;

    invoke-direct {p0, p1}, Lcom/airbnb/lottie/parser/moshi/f$f;-><init>(Lcom/airbnb/lottie/parser/moshi/f;)V

    return-void
.end method


# virtual methods
.method public next()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/airbnb/lottie/parser/moshi/f$f;->a()Lcom/airbnb/lottie/parser/moshi/f$g;

    move-result-object v0

    iget-object v0, v0, Lcom/airbnb/lottie/parser/moshi/f$g;->f:Ljava/lang/Object;

    return-object v0
.end method
