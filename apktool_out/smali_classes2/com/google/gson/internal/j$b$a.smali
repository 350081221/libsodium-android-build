.class Lcom/google/gson/internal/j$b$a;
.super Lcom/google/gson/internal/j$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/gson/internal/j$b;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/gson/internal/j<",
        "TK;TV;>.d<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field final synthetic e:Lcom/google/gson/internal/j$b;


# direct methods
.method constructor <init>(Lcom/google/gson/internal/j$b;)V
    .locals 0

    iput-object p1, p0, Lcom/google/gson/internal/j$b$a;->e:Lcom/google/gson/internal/j$b;

    iget-object p1, p1, Lcom/google/gson/internal/j$b;->a:Lcom/google/gson/internal/j;

    invoke-direct {p0, p1}, Lcom/google/gson/internal/j$d;-><init>(Lcom/google/gson/internal/j;)V

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

    invoke-virtual {p0}, Lcom/google/gson/internal/j$d;->a()Lcom/google/gson/internal/j$e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/gson/internal/j$b$a;->b()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method
