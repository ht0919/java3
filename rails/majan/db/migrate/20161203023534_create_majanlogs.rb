class CreateMajanlogs < ActiveRecord::Migration
  def change
    create_table :majanlogs do |t|
      t.date :date
      t.integer :num
      t.string :name1
      t.integer :score1
      t.string :name2
      t.integer :score2
      t.string :name3
      t.integer :score3
      t.string :name4
      t.integer :score4

      t.timestamps null: false
    end
  end
end
