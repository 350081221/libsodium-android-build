.class final Lcom/google/gson/internal/bind/l$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/gson/s;
.implements Lcom/google/gson/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/gson/internal/bind/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/gson/internal/bind/l;


# direct methods
.method private constructor <init>(Lcom/google/gson/internal/bind/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/gson/internal/bind/l$b;->a:Lcom/google/gson/internal/bind/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/gson/internal/bind/l;Lcom/google/gson/internal/bind/l$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/google/gson/internal/bind/l$b;-><init>(Lcom/google/gson/internal/bind/l;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/lang/reflect/Type;)Lcom/google/gson/l;
    .locals 1

    iget-object v0, p0, Lcom/google/gson/internal/bind/l$b;->a:Lcom/google/gson/internal/bind/l;

    iget-object v0, v0, Lcom/google/gson/internal/bind/l;->c:Lcom/google/gson/f;

    invoke-virtual {v0, p1, p2}, Lcom/google/gson/f;->H(Ljava/lang/Object;Ljava/lang/reflect/Type;)Lcom/google/gson/l;

    move-result-object p1

    return-object p1
.end method

.method public b(Lcom/google/gson/l;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/gson/l;",
            "Ljava/lang/reflect/Type;",
            ")TR;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/gson/p;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/gson/internal/bind/l$b;->a:Lcom/google/gson/internal/bind/l;

    iget-object v0, v0, Lcom/google/gson/internal/bind/l;->c:Lcom/google/gson/f;

    invoke-virtual {v0, p1, p2}, Lcom/google/gson/f;->j(Lcom/google/gson/l;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/Object;)Lcom/google/gson/l;
    .locals 1

    iget-object v0, p0, Lcom/google/gson/internal/bind/l$b;->a:Lcom/google/gson/internal/bind/l;

    iget-object v0, v0, Lcom/google/gson/internal/bind/l;->c:Lcom/google/gson/f;

    invoke-virtual {v0, p1}, Lcom/google/gson/f;->G(Ljava/lang/Object;)Lcom/google/gson/l;

    move-result-object p1

    return-object p1
.end method
