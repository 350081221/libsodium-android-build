.class final Lcom/google/gson/internal/bind/n$x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/gson/y;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/gson/internal/bind/n;->a(Lcom/google/gson/reflect/a;Lcom/google/gson/x;)Lcom/google/gson/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/gson/reflect/a;

.field final synthetic b:Lcom/google/gson/x;


# direct methods
.method constructor <init>(Lcom/google/gson/reflect/a;Lcom/google/gson/x;)V
    .locals 0

    iput-object p1, p0, Lcom/google/gson/internal/bind/n$x;->a:Lcom/google/gson/reflect/a;

    iput-object p2, p0, Lcom/google/gson/internal/bind/n$x;->b:Lcom/google/gson/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/gson/f;Lcom/google/gson/reflect/a;)Lcom/google/gson/x;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/gson/f;",
            "Lcom/google/gson/reflect/a<",
            "TT;>;)",
            "Lcom/google/gson/x<",
            "TT;>;"
        }
    .end annotation

    iget-object p1, p0, Lcom/google/gson/internal/bind/n$x;->a:Lcom/google/gson/reflect/a;

    invoke-virtual {p2, p1}, Lcom/google/gson/reflect/a;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/gson/internal/bind/n$x;->b:Lcom/google/gson/x;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method
