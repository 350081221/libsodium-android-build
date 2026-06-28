.class public final synthetic Lcom/yuanqi/master/tools/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lv3/l;

.field public final synthetic b:Lcom/yqtech/multiapp/databinding/DialogSetNoteBinding;

.field public final synthetic c:Lcom/yuanqi/master/tools/dialog/b;


# direct methods
.method public synthetic constructor <init>(Lv3/l;Lcom/yqtech/multiapp/databinding/DialogSetNoteBinding;Lcom/yuanqi/master/tools/dialog/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/master/tools/f0;->a:Lv3/l;

    iput-object p2, p0, Lcom/yuanqi/master/tools/f0;->b:Lcom/yqtech/multiapp/databinding/DialogSetNoteBinding;

    iput-object p3, p0, Lcom/yuanqi/master/tools/f0;->c:Lcom/yuanqi/master/tools/dialog/b;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lcom/yuanqi/master/tools/f0;->a:Lv3/l;

    iget-object v1, p0, Lcom/yuanqi/master/tools/f0;->b:Lcom/yqtech/multiapp/databinding/DialogSetNoteBinding;

    iget-object v2, p0, Lcom/yuanqi/master/tools/f0;->c:Lcom/yuanqi/master/tools/dialog/b;

    invoke-static {v0, v1, v2, p1}, Lcom/yuanqi/master/tools/o0;->p(Lv3/l;Lcom/yqtech/multiapp/databinding/DialogSetNoteBinding;Lcom/yuanqi/master/tools/dialog/b;Landroid/view/View;)V

    return-void
.end method
