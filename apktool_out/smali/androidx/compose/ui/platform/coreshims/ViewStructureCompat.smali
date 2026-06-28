.class public Landroidx/compose/ui/platform/coreshims/ViewStructureCompat;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/platform/coreshims/ViewStructureCompat$Api23Impl;
    }
.end annotation


# instance fields
.field private final mWrappedObj:Ljava/lang/Object;


# direct methods
.method private constructor <init>(Landroid/view/ViewStructure;)V
    .locals 0
    .param p1    # Landroid/view/ViewStructure;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/platform/coreshims/ViewStructureCompat;->mWrappedObj:Ljava/lang/Object;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public static toViewStructureCompat(Landroid/view/ViewStructure;)Landroidx/compose/ui/platform/coreshims/ViewStructureCompat;
    .locals 1
    .param p0    # Landroid/view/ViewStructure;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x17
    .end annotation

    new-instance v0, Landroidx/compose/ui/platform/coreshims/ViewStructureCompat;

    invoke-direct {v0, p0}, Landroidx/compose/ui/platform/coreshims/ViewStructureCompat;-><init>(Landroid/view/ViewStructure;)V

    return-object v0
.end method


# virtual methods
.method public setClassName(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/compose/ui/platform/coreshims/ViewStructureCompat;->mWrappedObj:Ljava/lang/Object;

    check-cast v0, Landroid/view/ViewStructure;

    invoke-static {v0, p1}, Landroidx/compose/ui/platform/coreshims/ViewStructureCompat$Api23Impl;->setClassName(Landroid/view/ViewStructure;Ljava/lang/String;)V

    return-void
.end method

.method public setContentDescription(Ljava/lang/CharSequence;)V
    .locals 1
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/compose/ui/platform/coreshims/ViewStructureCompat;->mWrappedObj:Ljava/lang/Object;

    check-cast v0, Landroid/view/ViewStructure;

    invoke-static {v0, p1}, Landroidx/compose/ui/platform/coreshims/ViewStructureCompat$Api23Impl;->setContentDescription(Landroid/view/ViewStructure;Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setDimens(IIIIII)V
    .locals 8

    iget-object v0, p0, Landroidx/compose/ui/platform/coreshims/ViewStructureCompat;->mWrappedObj:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroid/view/ViewStructure;

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move v7, p6

    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/platform/coreshims/ViewStructureCompat$Api23Impl;->setDimens(Landroid/view/ViewStructure;IIIIII)V

    return-void
.end method

.method public setText(Ljava/lang/CharSequence;)V
    .locals 1
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/compose/ui/platform/coreshims/ViewStructureCompat;->mWrappedObj:Ljava/lang/Object;

    check-cast v0, Landroid/view/ViewStructure;

    invoke-static {v0, p1}, Landroidx/compose/ui/platform/coreshims/ViewStructureCompat$Api23Impl;->setText(Landroid/view/ViewStructure;Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setTextStyle(FIII)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/coreshims/ViewStructureCompat;->mWrappedObj:Ljava/lang/Object;

    check-cast v0, Landroid/view/ViewStructure;

    invoke-static {v0, p1, p2, p3, p4}, Landroidx/compose/ui/platform/coreshims/ViewStructureCompat$Api23Impl;->setTextStyle(Landroid/view/ViewStructure;FIII)V

    return-void
.end method

.method public toViewStructure()Landroid/view/ViewStructure;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x17
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/platform/coreshims/ViewStructureCompat;->mWrappedObj:Ljava/lang/Object;

    check-cast v0, Landroid/view/ViewStructure;

    return-object v0
.end method
