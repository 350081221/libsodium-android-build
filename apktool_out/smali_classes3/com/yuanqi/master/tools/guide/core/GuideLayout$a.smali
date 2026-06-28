.class Lcom/yuanqi/master/tools/guide/core/GuideLayout$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/tools/guide/core/GuideLayout;->setGuidePage(Lcom/yuanqi/master/tools/guide/model/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/yuanqi/master/tools/guide/core/GuideLayout;


# direct methods
.method constructor <init>(Lcom/yuanqi/master/tools/guide/core/GuideLayout;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/master/tools/guide/core/GuideLayout$a;->a:Lcom/yuanqi/master/tools/guide/core/GuideLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/yuanqi/master/tools/guide/core/GuideLayout$a;->a:Lcom/yuanqi/master/tools/guide/core/GuideLayout;

    .line 2
    .line 3
    iget-object p1, p1, Lcom/yuanqi/master/tools/guide/core/GuideLayout;->c:Lcom/yuanqi/master/tools/guide/model/a;

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/yuanqi/master/tools/guide/model/a;->C()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, Lcom/yuanqi/master/tools/guide/core/GuideLayout$a;->a:Lcom/yuanqi/master/tools/guide/core/GuideLayout;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/yuanqi/master/tools/guide/core/GuideLayout;->h()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method
