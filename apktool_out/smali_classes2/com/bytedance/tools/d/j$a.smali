.class final Lcom/bytedance/tools/d/j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/tools/d/j;->i(Landroid/content/Context;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/tools/d/j$a;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/bytedance/tools/d/j$a;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    new-instance v0, Lm1/a;

    invoke-direct {v0}, Lm1/a;-><init>()V

    iget-object v1, p0, Lcom/bytedance/tools/d/j$a;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/bytedance/tools/d/j$a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lm1/a;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
