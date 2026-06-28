.class Lcom/google/gson/internal/i$e$a;
.super Lcom/google/gson/internal/i$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/gson/internal/i$e;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/gson/internal/i<",
        "TK;TV;>.f<TK;>;"
    }
.end annotation


# instance fields
.field final synthetic e:Lcom/google/gson/internal/i$e;


# direct methods
.method constructor <init>(Lcom/google/gson/internal/i$e;)V
    .locals 0

    iput-object p1, p0, Lcom/google/gson/internal/i$e$a;->e:Lcom/google/gson/internal/i$e;

    iget-object p1, p1, Lcom/google/gson/internal/i$e;->a:Lcom/google/gson/internal/i;

    invoke-direct {p0, p1}, Lcom/google/gson/internal/i$f;-><init>(Lcom/google/gson/internal/i;)V

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

    invoke-virtual {p0}, Lcom/google/gson/internal/i$f;->a()Lcom/google/gson/internal/i$g;

    move-result-object v0

    iget-object v0, v0, Lcom/google/gson/internal/i$g;->f:Ljava/lang/Object;

    return-object v0
.end method
