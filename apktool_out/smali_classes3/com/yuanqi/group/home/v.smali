.class public final synthetic Lcom/yuanqi/group/home/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Landroid/app/Activity;

.field public final synthetic b:Lcom/yuanqi/group/home/k0;

.field public final synthetic c:Lv3/a;

.field public final synthetic d:Lv3/a;

.field public final synthetic e:Lcom/yuanqi/group/home/models/b;

.field public final synthetic f:I

.field public final synthetic g:Z

.field public final synthetic h:Lv2/b;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Lcom/yuanqi/group/home/k0;Lv3/a;Lv3/a;Lcom/yuanqi/group/home/models/b;IZLv2/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/group/home/v;->a:Landroid/app/Activity;

    iput-object p2, p0, Lcom/yuanqi/group/home/v;->b:Lcom/yuanqi/group/home/k0;

    iput-object p3, p0, Lcom/yuanqi/group/home/v;->c:Lv3/a;

    iput-object p4, p0, Lcom/yuanqi/group/home/v;->d:Lv3/a;

    iput-object p5, p0, Lcom/yuanqi/group/home/v;->e:Lcom/yuanqi/group/home/models/b;

    iput p6, p0, Lcom/yuanqi/group/home/v;->f:I

    iput-boolean p7, p0, Lcom/yuanqi/group/home/v;->g:Z

    iput-object p8, p0, Lcom/yuanqi/group/home/v;->h:Lv2/b;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 9

    iget-object v0, p0, Lcom/yuanqi/group/home/v;->a:Landroid/app/Activity;

    iget-object v1, p0, Lcom/yuanqi/group/home/v;->b:Lcom/yuanqi/group/home/k0;

    iget-object v2, p0, Lcom/yuanqi/group/home/v;->c:Lv3/a;

    iget-object v3, p0, Lcom/yuanqi/group/home/v;->d:Lv3/a;

    iget-object v4, p0, Lcom/yuanqi/group/home/v;->e:Lcom/yuanqi/group/home/models/b;

    iget v5, p0, Lcom/yuanqi/group/home/v;->f:I

    iget-boolean v6, p0, Lcom/yuanqi/group/home/v;->g:Z

    iget-object v7, p0, Lcom/yuanqi/group/home/v;->h:Lv2/b;

    move-object v8, p1

    invoke-static/range {v0 .. v8}, Lcom/yuanqi/group/home/k0;->n(Landroid/app/Activity;Lcom/yuanqi/group/home/k0;Lv3/a;Lv3/a;Lcom/yuanqi/group/home/models/b;IZLv2/b;Landroid/view/View;)V

    return-void
.end method
