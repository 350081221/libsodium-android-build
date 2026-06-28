.class public Li/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Li/c;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;)Ljava/lang/String;
    .locals 0

    .line 2
    invoke-static {p1}, Lcom/a/a/a/b$e;->c(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 1
    check-cast p1, Landroid/os/Bundle;

    invoke-virtual {p0, p1}, Li/a;->a(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
