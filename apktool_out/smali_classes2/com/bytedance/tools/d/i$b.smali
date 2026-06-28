.class final Lcom/bytedance/tools/d/i$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/tools/d/i;->a(Landroidx/appcompat/app/AppCompatActivity;Landroidx/appcompat/widget/Toolbar;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/appcompat/app/AppCompatActivity;


# direct methods
.method constructor <init>(Landroidx/appcompat/app/AppCompatActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/tools/d/i$b;->a:Landroidx/appcompat/app/AppCompatActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    iget-object p1, p0, Lcom/bytedance/tools/d/i$b;->a:Landroidx/appcompat/app/AppCompatActivity;

    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/bytedance/tools/d/i$b;->a:Landroidx/appcompat/app/AppCompatActivity;

    const-class v2, Lcom/bytedance/tools/ui/FeedBackActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
