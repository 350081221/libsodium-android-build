.class Lcom/google/gson/internal/i$d$a;
.super Lcom/google/gson/internal/i$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/gson/internal/i$d;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/gson/internal/i<",
        "TK;TV;>.f<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field final synthetic e:Lcom/google/gson/internal/i$d;


# direct methods
.method constructor <init>(Lcom/google/gson/internal/i$d;)V
    .locals 0

    iput-object p1, p0, Lcom/google/gson/internal/i$d$a;->e:Lcom/google/gson/internal/i$d;

    iget-object p1, p1, Lcom/google/gson/internal/i$d;->a:Lcom/google/gson/internal/i;

    invoke-direct {p0, p1}, Lcom/google/gson/internal/i$f;-><init>(Lcom/google/gson/internal/i;)V

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

    invoke-virtual {p0}, Lcom/google/gson/internal/i$f;->a()Lcom/google/gson/internal/i$g;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/gson/internal/i$d$a;->b()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method
