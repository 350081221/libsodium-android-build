.class public final synthetic Lcom/yuanqi/master/tools/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/yuanqi/master/tools/dialog/b;

.field public final synthetic b:Lv3/a;


# direct methods
.method public synthetic constructor <init>(Lcom/yuanqi/master/tools/dialog/b;Lv3/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/master/tools/j;->a:Lcom/yuanqi/master/tools/dialog/b;

    iput-object p2, p0, Lcom/yuanqi/master/tools/j;->b:Lv3/a;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/yuanqi/master/tools/j;->a:Lcom/yuanqi/master/tools/dialog/b;

    iget-object v1, p0, Lcom/yuanqi/master/tools/j;->b:Lv3/a;

    invoke-static {v0, v1, p1}, Lcom/yuanqi/master/tools/o0;->t(Lcom/yuanqi/master/tools/dialog/b;Lv3/a;Landroid/view/View;)V

    return-void
.end method
