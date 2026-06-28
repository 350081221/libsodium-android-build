.class Lcom/airbnb/lottie/x0$a;
.super Lcom/airbnb/lottie/value/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/airbnb/lottie/x0;->w(Lcom/airbnb/lottie/model/e;Ljava/lang/Object;Lcom/airbnb/lottie/value/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/airbnb/lottie/value/j<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final synthetic d:Lcom/airbnb/lottie/value/l;

.field final synthetic e:Lcom/airbnb/lottie/x0;


# direct methods
.method constructor <init>(Lcom/airbnb/lottie/x0;Lcom/airbnb/lottie/value/l;)V
    .locals 0

    iput-object p1, p0, Lcom/airbnb/lottie/x0$a;->e:Lcom/airbnb/lottie/x0;

    iput-object p2, p0, Lcom/airbnb/lottie/x0$a;->d:Lcom/airbnb/lottie/value/l;

    invoke-direct {p0}, Lcom/airbnb/lottie/value/j;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/airbnb/lottie/value/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/airbnb/lottie/value/b<",
            "TT;>;)TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/airbnb/lottie/x0$a;->d:Lcom/airbnb/lottie/value/l;

    invoke-interface {v0, p1}, Lcom/airbnb/lottie/value/l;->a(Lcom/airbnb/lottie/value/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
