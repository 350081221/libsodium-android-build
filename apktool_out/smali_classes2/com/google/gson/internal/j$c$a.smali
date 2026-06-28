.class Lcom/google/gson/internal/j$c$a;
.super Lcom/google/gson/internal/j$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/gson/internal/j$c;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/gson/internal/j<",
        "TK;TV;>.d<TK;>;"
    }
.end annotation


# instance fields
.field final synthetic e:Lcom/google/gson/internal/j$c;


# direct methods
.method constructor <init>(Lcom/google/gson/internal/j$c;)V
    .locals 0

    iput-object p1, p0, Lcom/google/gson/internal/j$c$a;->e:Lcom/google/gson/internal/j$c;

    iget-object p1, p1, Lcom/google/gson/internal/j$c;->a:Lcom/google/gson/internal/j;

    invoke-direct {p0, p1}, Lcom/google/gson/internal/j$d;-><init>(Lcom/google/gson/internal/j;)V

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

    invoke-virtual {p0}, Lcom/google/gson/internal/j$d;->a()Lcom/google/gson/internal/j$e;

    move-result-object v0

    iget-object v0, v0, Lcom/google/gson/internal/j$e;->f:Ljava/lang/Object;

    return-object v0
.end method
