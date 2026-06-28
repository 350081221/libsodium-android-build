.class public final synthetic Lcom/yuanqi/master/tools/d1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/yuanqi/master/tools/UserNameAdapter;

.field public final synthetic b:Lcom/yuanqi/master/tools/UserNameAdapter$ViewHolder;


# direct methods
.method public synthetic constructor <init>(Lcom/yuanqi/master/tools/UserNameAdapter;Lcom/yuanqi/master/tools/UserNameAdapter$ViewHolder;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/master/tools/d1;->a:Lcom/yuanqi/master/tools/UserNameAdapter;

    iput-object p2, p0, Lcom/yuanqi/master/tools/d1;->b:Lcom/yuanqi/master/tools/UserNameAdapter$ViewHolder;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/yuanqi/master/tools/d1;->a:Lcom/yuanqi/master/tools/UserNameAdapter;

    iget-object v1, p0, Lcom/yuanqi/master/tools/d1;->b:Lcom/yuanqi/master/tools/UserNameAdapter$ViewHolder;

    invoke-static {v0, v1, p1}, Lcom/yuanqi/master/tools/UserNameAdapter;->a(Lcom/yuanqi/master/tools/UserNameAdapter;Lcom/yuanqi/master/tools/UserNameAdapter$ViewHolder;Landroid/view/View;)V

    return-void
.end method
