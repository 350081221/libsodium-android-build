.class Landroidx/cursoradapter/widget/CursorAdapter$MyDataSetObserver;
.super Landroid/database/DataSetObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/cursoradapter/widget/CursorAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "MyDataSetObserver"
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/cursoradapter/widget/CursorAdapter;


# direct methods
.method constructor <init>(Landroidx/cursoradapter/widget/CursorAdapter;)V
    .locals 0

    iput-object p1, p0, Landroidx/cursoradapter/widget/CursorAdapter$MyDataSetObserver;->this$0:Landroidx/cursoradapter/widget/CursorAdapter;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public onChanged()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/cursoradapter/widget/CursorAdapter$MyDataSetObserver;->this$0:Landroidx/cursoradapter/widget/CursorAdapter;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, v0, Landroidx/cursoradapter/widget/CursorAdapter;->mDataValid:Z

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 7
    .line 8
    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public onInvalidated()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/cursoradapter/widget/CursorAdapter$MyDataSetObserver;->this$0:Landroidx/cursoradapter/widget/CursorAdapter;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, v0, Landroidx/cursoradapter/widget/CursorAdapter;->mDataValid:Z

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetInvalidated()V

    .line 7
    .line 8
    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
