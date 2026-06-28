.class Lcom/zzhoujay/richtext/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zzhoujay/richtext/f;->d(Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/zzhoujay/richtext/f;


# direct methods
.method constructor <init>(Lcom/zzhoujay/richtext/f;)V
    .locals 0

    iput-object p1, p0, Lcom/zzhoujay/richtext/f$a;->a:Lcom/zzhoujay/richtext/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/zzhoujay/richtext/f$a;->a:Lcom/zzhoujay/richtext/f;

    invoke-static {v0}, Lcom/zzhoujay/richtext/f;->a(Lcom/zzhoujay/richtext/f;)Lcom/zzhoujay/richtext/g;

    move-result-object v0

    iget-object v0, v0, Lcom/zzhoujay/richtext/g;->r:Le3/b;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Le3/b;->a(Z)V

    return-void
.end method
