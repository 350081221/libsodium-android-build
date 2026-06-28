.class public final synthetic Lcom/yuanqi/master/tools/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lkotlin/jvm/internal/k1$h;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lcom/yuanqi/master/tools/dialog/b;

.field public final synthetic d:Lv3/a;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/k1$h;Ljava/lang/String;Lcom/yuanqi/master/tools/dialog/b;Lv3/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/master/tools/n0;->a:Lkotlin/jvm/internal/k1$h;

    iput-object p2, p0, Lcom/yuanqi/master/tools/n0;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/yuanqi/master/tools/n0;->c:Lcom/yuanqi/master/tools/dialog/b;

    iput-object p4, p0, Lcom/yuanqi/master/tools/n0;->d:Lv3/a;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    iget-object v0, p0, Lcom/yuanqi/master/tools/n0;->a:Lkotlin/jvm/internal/k1$h;

    iget-object v1, p0, Lcom/yuanqi/master/tools/n0;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/yuanqi/master/tools/n0;->c:Lcom/yuanqi/master/tools/dialog/b;

    iget-object v3, p0, Lcom/yuanqi/master/tools/n0;->d:Lv3/a;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/yuanqi/master/tools/o0;->a(Lkotlin/jvm/internal/k1$h;Ljava/lang/String;Lcom/yuanqi/master/tools/dialog/b;Lv3/a;Landroid/view/View;)V

    return-void
.end method
