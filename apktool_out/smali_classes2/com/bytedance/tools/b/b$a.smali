.class final Lcom/bytedance/tools/b/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm1/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/tools/b/b;->d(Lm1/a$a;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lm1/a$a;

.field final synthetic b:Ljava/io/File;


# direct methods
.method constructor <init>(Lm1/a$a;Ljava/io/File;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/tools/b/b$a;->a:Lm1/a$a;

    iput-object p2, p0, Lcom/bytedance/tools/b/b$a;->b:Ljava/io/File;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILjava/lang/String;)V
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/bytedance/tools/b/b$a;->a:Lm1/a$a;

    invoke-interface {v0, p1, p2}, Lm1/a$a;->a(ILjava/lang/String;)V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/tools/b/b$a;->a:Lm1/a$a;

    invoke-interface {v0, p1}, Lm1/a$a;->a(Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Lcom/bytedance/tools/b/b$a;->b:Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 3
    new-instance p1, Ljava/io/File;

    invoke-static {}, Lcom/bytedance/tools/b/b;->f()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/bytedance/tools/d/f;->c(Ljava/io/File;)V

    return-void
.end method
