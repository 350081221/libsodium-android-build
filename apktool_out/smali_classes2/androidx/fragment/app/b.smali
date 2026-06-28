.class public final synthetic Landroidx/fragment/app/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/fragment/app/SpecialEffectsController$Operation;

.field public final synthetic b:Landroidx/fragment/app/SpecialEffectsController$Operation;

.field public final synthetic c:Z

.field public final synthetic d:Landroidx/collection/ArrayMap;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/fragment/app/SpecialEffectsController$Operation;ZLandroidx/collection/ArrayMap;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/b;->a:Landroidx/fragment/app/SpecialEffectsController$Operation;

    iput-object p2, p0, Landroidx/fragment/app/b;->b:Landroidx/fragment/app/SpecialEffectsController$Operation;

    iput-boolean p3, p0, Landroidx/fragment/app/b;->c:Z

    iput-object p4, p0, Landroidx/fragment/app/b;->d:Landroidx/collection/ArrayMap;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Landroidx/fragment/app/b;->a:Landroidx/fragment/app/SpecialEffectsController$Operation;

    iget-object v1, p0, Landroidx/fragment/app/b;->b:Landroidx/fragment/app/SpecialEffectsController$Operation;

    iget-boolean v2, p0, Landroidx/fragment/app/b;->c:Z

    iget-object v3, p0, Landroidx/fragment/app/b;->d:Landroidx/collection/ArrayMap;

    invoke-static {v0, v1, v2, v3}, Landroidx/fragment/app/DefaultSpecialEffectsController;->d(Landroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/fragment/app/SpecialEffectsController$Operation;ZLandroidx/collection/ArrayMap;)V

    return-void
.end method
